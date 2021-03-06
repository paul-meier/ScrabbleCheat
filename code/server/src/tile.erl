-module(tile).

-define(SPACE, 32).
-export([new_tile/4, 
         print_tile/1,
         duplicate_tile/2,
         get_tile_letter/1,
         get_tile_bonus/1,
         get_tile_location/1,
         set_tile_letter/2,
         get_tile_letter_type/1,
         set_tile_letter_type/2,
         set_tile_bonus/2,
         set_tile_location/2,
         is_wildcard/1,
         is_occupied/1,
         belongs_to_board/2]).

%% Datatype for a tile, which is what the board is composed of. Keeps track of 
%% bonuses, and which letter is where.  

%% Bonus types are none, triple_letter_score, double_letter_score, triple_word_score, double_word_score.
%% 'Occupied' means, what's in the tile.  It can be none, {character, Char}, {wildcard, Char}, or none.
%% Tiles store their own locations.  This is 1-indexed, following convention with the rest of the program.

new_tile(Occupied, Bonus, Row, Col) ->
    {Occupied, Bonus, {Row, Col}}.


is_occupied(Tile) ->
    get_tile_letter(Tile) =/= none.


get_tile_letter({{_, Letter}, _, _}) -> Letter;
get_tile_letter({none, _, _}) -> none.

get_tile_bonus({_, Bonus, _}) -> Bonus.
get_tile_location({_, _, Location}) -> Location.

get_tile_letter_type({none, _, _}) -> none;
get_tile_letter_type({{LetterType, _}, _, _}) -> LetterType.


is_wildcard({{wildcard,_}, _, _}) -> true;
is_wildcard(_Else) -> false.

duplicate_tile(X, Y) -> X =:= Y.

set_tile_letter(NewLetter, {{Type, _}, Bonus, Location}) -> {{Type, NewLetter}, Bonus, Location};
set_tile_letter(NewLetter, {none, Bonus, Location}) -> {{character, NewLetter}, Bonus, Location}.

set_tile_letter_type(Type, {{_, Letter}, Bonus, Location}) -> {{Type, Letter}, Bonus, Location}.

set_tile_bonus(NewBonus, {Letter, _, Location}) -> {Letter, NewBonus, Location}.
set_tile_location(NewLocation, {Letter, Bonus, _}) -> {Letter, Bonus, NewLocation}.


print_tile({none, Bonus, _}) ->
    print_tile_skeleton(?SPACE, Bonus);
print_tile({{_, Letter}, Bonus, _}) ->
    print_tile_skeleton(Letter, Bonus).

print_tile_skeleton(Letter, Bonus) ->
    case Bonus of
        none -> io:format(" ~s ", [[Letter]]);
        triple_word_score -> io:format("*~s*", [[Letter]]);
        double_word_score -> io:format("^~s^", [[Letter]]);
        triple_letter_score -> io:format("-~s-", [[Letter]]);
        double_letter_score -> io:format("_~s_", [[Letter]]);
        _false -> uh_oh
    end.


belongs_to_board(Tile, Board) ->
    Bonus = get_tile_bonus(Tile),
    {Row, Col} = get_tile_location(Tile),
    BoardTile = board:get_tile(Row, Col, Board),

    Bonus =:= get_tile_bonus(BoardTile).

