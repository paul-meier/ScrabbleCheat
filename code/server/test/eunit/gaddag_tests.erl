-module(gaddag_tests).
-include_lib("eunit/include/eunit.hrl").

-define(TESTDICT, lists:concat([code:priv_dir(scrabblecheat), "/gaddag_test.dict"])).

get_fixture_gaddag() ->
    bin_trie:get_root(twl06).
setup() ->
    bin_trie:start_from_file(?TESTDICT).
teardown() ->
    case whereis(giant_bintrie) of
        undefined -> ok;
        Else -> unregister(giant_bintrie),
                exit(Else, "Test finished")
    end.


has_branch_test() ->
    setup(),
    Gaddag = get_fixture_gaddag(),
    run_has_branch(Gaddag),
    teardown().

run_has_branch(Gaddag) ->
    ?assert(gaddag:has_branch($O, Gaddag)),
    ?assert(gaddag:has_branch($W, Gaddag)),
    ?assert(gaddag:has_branch($E, Gaddag)),
    ?assert(gaddag:has_branch($U, Gaddag)).
 

get_branch_test() ->
    setup(),
    Gaddag = get_fixture_gaddag(),
    run_get_branch(Gaddag),
    teardown().

run_get_branch(Gaddag) ->
    {branch, Trie1} = gaddag:get_branch($W, Gaddag),
    {branch, Trie2} = gaddag:get_branch($O, Gaddag),
    {branch, Trie3} = gaddag:get_branch($U, Gaddag),
    ?assert(gaddag:has_branch($O, Trie1)),
    ?assert(gaddag:has_branch($&, Trie2)),
    ?assert(gaddag:has_branch($A, Trie3)),
    ?assert(gaddag:has_branch($T, Trie3) =:= false),
    ?assert(gaddag:has_branch($T, Gaddag) =:= false).

 

search_test() -> 
    setup(),
    Gaddag = get_fixture_gaddag(),
    run_search(Gaddag),
    teardown().

run_search(Gaddag) ->
    ?assert(gaddag:has_word("PAMPER", Gaddag)),
    ?assert(gaddag:has_word("WIZARD", Gaddag)),
    ?assert(gaddag:has_word("OX", Gaddag)),
    ?assert(gaddag:has_word("PAULIE", Gaddag)),
    ?assert(gaddag:has_word("PAULI", Gaddag) =:= false),
    ?assert(gaddag:has_word("WIZ", Gaddag) =:= false),
    ?assert(gaddag:has_word("AMPER", Gaddag) =:= false).
 


one_letter_word_test() ->
    setup(),
    Gaddag = get_fixture_gaddag(),
    run_one_letter(Gaddag),
    teardown().

run_one_letter(Gaddag) ->
    ?assert(gaddag:is_terminator(Gaddag) =:= false).

