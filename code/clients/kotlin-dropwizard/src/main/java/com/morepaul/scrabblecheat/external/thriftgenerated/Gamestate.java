package com.morepaul.scrabblecheat.external.thriftgenerated;

/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * The primary data structure.  This allows the server to do any of its
 * operations, and a client to display the game as needed to the client.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-04-10")
public class Gamestate implements org.apache.thrift.TBase<Gamestate, Gamestate._Fields>, java.io.Serializable, Cloneable, Comparable<Gamestate> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Gamestate");

  private static final org.apache.thrift.protocol.TField BOARD_FIELD_DESC = new org.apache.thrift.protocol.TField("board", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField SCORES_FIELD_DESC = new org.apache.thrift.protocol.TField("scores", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField PLAYER_TURN_FIELD_DESC = new org.apache.thrift.protocol.TField("player_turn", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TURN_ORDER_FIELD_DESC = new org.apache.thrift.protocol.TField("turn_order", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField HISTORY_FIELD_DESC = new org.apache.thrift.protocol.TField("history", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField GAME_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("game_name", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField DICT_FIELD_DESC = new org.apache.thrift.protocol.TField("dict", org.apache.thrift.protocol.TType.I32, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GamestateStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GamestateTupleSchemeFactory());
  }

  private List<Tile> board; // required
  private Map<String,Short> scores; // required
  private String player_turn; // required
  private List<String> turn_order; // required
  private List<Turn> history; // required
  private GameName game_name; // required
  private Dictionary dict; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BOARD((short)1, "board"),
    SCORES((short)2, "scores"),
    PLAYER_TURN((short)3, "player_turn"),
    TURN_ORDER((short)4, "turn_order"),
    HISTORY((short)5, "history"),
    /**
     * 
     * @see GameName
     */
    GAME_NAME((short)6, "game_name"),
    /**
     * 
     * @see Dictionary
     */
    DICT((short)7, "dict");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BOARD
          return BOARD;
        case 2: // SCORES
          return SCORES;
        case 3: // PLAYER_TURN
          return PLAYER_TURN;
        case 4: // TURN_ORDER
          return TURN_ORDER;
        case 5: // HISTORY
          return HISTORY;
        case 6: // GAME_NAME
          return GAME_NAME;
        case 7: // DICT
          return DICT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BOARD, new org.apache.thrift.meta_data.FieldMetaData("board", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.LIST        , "Board")));
    tmpMap.put(_Fields.SCORES, new org.apache.thrift.meta_data.FieldMetaData("scores", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16))));
    tmpMap.put(_Fields.PLAYER_TURN, new org.apache.thrift.meta_data.FieldMetaData("player_turn", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TURN_ORDER, new org.apache.thrift.meta_data.FieldMetaData("turn_order", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.HISTORY, new org.apache.thrift.meta_data.FieldMetaData("history", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Turn.class))));
    tmpMap.put(_Fields.GAME_NAME, new org.apache.thrift.meta_data.FieldMetaData("game_name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, GameName.class)));
    tmpMap.put(_Fields.DICT, new org.apache.thrift.meta_data.FieldMetaData("dict", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Dictionary.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Gamestate.class, metaDataMap);
  }

  public Gamestate() {
  }

  public Gamestate(
    List<Tile> board,
    Map<String,Short> scores,
    String player_turn,
    List<String> turn_order,
    List<Turn> history,
    GameName game_name,
    Dictionary dict)
  {
    this();
    this.board = board;
    this.scores = scores;
    this.player_turn = player_turn;
    this.turn_order = turn_order;
    this.history = history;
    this.game_name = game_name;
    this.dict = dict;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Gamestate(Gamestate other) {
    if (other.isSetBoard()) {
      this.board = other.board;
    }
    if (other.isSetScores()) {
      Map<String,Short> __this__scores = new HashMap<String,Short>(other.scores);
      this.scores = __this__scores;
    }
    if (other.isSetPlayerTurn()) {
      this.player_turn = other.player_turn;
    }
    if (other.isSetTurnOrder()) {
      List<String> __this__turn_order = new ArrayList<String>(other.turn_order);
      this.turn_order = __this__turn_order;
    }
    if (other.isSetHistory()) {
      List<Turn> __this__history = new ArrayList<Turn>(other.history.size());
      for (Turn other_element : other.history) {
        __this__history.add(new Turn(other_element));
      }
      this.history = __this__history;
    }
    if (other.isSetGameName()) {
      this.game_name = other.game_name;
    }
    if (other.isSetDict()) {
      this.dict = other.dict;
    }
  }

  public Gamestate deepCopy() {
    return new Gamestate(this);
  }

  @Override
  public void clear() {
    this.board = null;
    this.scores = null;
    this.player_turn = null;
    this.turn_order = null;
    this.history = null;
    this.game_name = null;
    this.dict = null;
  }

  public int getBoardSize() {
    return (this.board == null) ? 0 : this.board.size();
  }

  public java.util.Iterator<Tile> getBoardIterator() {
    return (this.board == null) ? null : this.board.iterator();
  }

  public void addToBoard(Tile elem) {
    if (this.board == null) {
      this.board = new ArrayList<Tile>();
    }
    this.board.add(elem);
  }

  public List<Tile> getBoard() {
    return this.board;
  }

  public void setBoard(List<Tile> board) {
    this.board = board;
  }

  public void unsetBoard() {
    this.board = null;
  }

  /** Returns true if field board is set (has been assigned a value) and false otherwise */
  public boolean isSetBoard() {
    return this.board != null;
  }

  public void setBoardIsSet(boolean value) {
    if (!value) {
      this.board = null;
    }
  }

  public int getScoresSize() {
    return (this.scores == null) ? 0 : this.scores.size();
  }

  public void putToScores(String key, short val) {
    if (this.scores == null) {
      this.scores = new HashMap<String,Short>();
    }
    this.scores.put(key, val);
  }

  public Map<String,Short> getScores() {
    return this.scores;
  }

  public void setScores(Map<String,Short> scores) {
    this.scores = scores;
  }

  public void unsetScores() {
    this.scores = null;
  }

  /** Returns true if field scores is set (has been assigned a value) and false otherwise */
  public boolean isSetScores() {
    return this.scores != null;
  }

  public void setScoresIsSet(boolean value) {
    if (!value) {
      this.scores = null;
    }
  }

  public String getPlayerTurn() {
    return this.player_turn;
  }

  public void setPlayerTurn(String player_turn) {
    this.player_turn = player_turn;
  }

  public void unsetPlayerTurn() {
    this.player_turn = null;
  }

  /** Returns true if field player_turn is set (has been assigned a value) and false otherwise */
  public boolean isSetPlayerTurn() {
    return this.player_turn != null;
  }

  public void setPlayerTurnIsSet(boolean value) {
    if (!value) {
      this.player_turn = null;
    }
  }

  public int getTurnOrderSize() {
    return (this.turn_order == null) ? 0 : this.turn_order.size();
  }

  public java.util.Iterator<String> getTurnOrderIterator() {
    return (this.turn_order == null) ? null : this.turn_order.iterator();
  }

  public void addToTurnOrder(String elem) {
    if (this.turn_order == null) {
      this.turn_order = new ArrayList<String>();
    }
    this.turn_order.add(elem);
  }

  public List<String> getTurnOrder() {
    return this.turn_order;
  }

  public void setTurnOrder(List<String> turn_order) {
    this.turn_order = turn_order;
  }

  public void unsetTurnOrder() {
    this.turn_order = null;
  }

  /** Returns true if field turn_order is set (has been assigned a value) and false otherwise */
  public boolean isSetTurnOrder() {
    return this.turn_order != null;
  }

  public void setTurnOrderIsSet(boolean value) {
    if (!value) {
      this.turn_order = null;
    }
  }

  public int getHistorySize() {
    return (this.history == null) ? 0 : this.history.size();
  }

  public java.util.Iterator<Turn> getHistoryIterator() {
    return (this.history == null) ? null : this.history.iterator();
  }

  public void addToHistory(Turn elem) {
    if (this.history == null) {
      this.history = new ArrayList<Turn>();
    }
    this.history.add(elem);
  }

  public List<Turn> getHistory() {
    return this.history;
  }

  public void setHistory(List<Turn> history) {
    this.history = history;
  }

  public void unsetHistory() {
    this.history = null;
  }

  /** Returns true if field history is set (has been assigned a value) and false otherwise */
  public boolean isSetHistory() {
    return this.history != null;
  }

  public void setHistoryIsSet(boolean value) {
    if (!value) {
      this.history = null;
    }
  }

  /**
   * 
   * @see GameName
   */
  public GameName getGameName() {
    return this.game_name;
  }

  /**
   * 
   * @see GameName
   */
  public void setGameName(GameName game_name) {
    this.game_name = game_name;
  }

  public void unsetGameName() {
    this.game_name = null;
  }

  /** Returns true if field game_name is set (has been assigned a value) and false otherwise */
  public boolean isSetGameName() {
    return this.game_name != null;
  }

  public void setGameNameIsSet(boolean value) {
    if (!value) {
      this.game_name = null;
    }
  }

  /**
   * 
   * @see Dictionary
   */
  public Dictionary getDict() {
    return this.dict;
  }

  /**
   * 
   * @see Dictionary
   */
  public void setDict(Dictionary dict) {
    this.dict = dict;
  }

  public void unsetDict() {
    this.dict = null;
  }

  /** Returns true if field dict is set (has been assigned a value) and false otherwise */
  public boolean isSetDict() {
    return this.dict != null;
  }

  public void setDictIsSet(boolean value) {
    if (!value) {
      this.dict = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BOARD:
      if (value == null) {
        unsetBoard();
      } else {
        setBoard((List<Tile>)value);
      }
      break;

    case SCORES:
      if (value == null) {
        unsetScores();
      } else {
        setScores((Map<String,Short>)value);
      }
      break;

    case PLAYER_TURN:
      if (value == null) {
        unsetPlayerTurn();
      } else {
        setPlayerTurn((String)value);
      }
      break;

    case TURN_ORDER:
      if (value == null) {
        unsetTurnOrder();
      } else {
        setTurnOrder((List<String>)value);
      }
      break;

    case HISTORY:
      if (value == null) {
        unsetHistory();
      } else {
        setHistory((List<Turn>)value);
      }
      break;

    case GAME_NAME:
      if (value == null) {
        unsetGameName();
      } else {
        setGameName((GameName)value);
      }
      break;

    case DICT:
      if (value == null) {
        unsetDict();
      } else {
        setDict((Dictionary)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BOARD:
      return getBoard();

    case SCORES:
      return getScores();

    case PLAYER_TURN:
      return getPlayerTurn();

    case TURN_ORDER:
      return getTurnOrder();

    case HISTORY:
      return getHistory();

    case GAME_NAME:
      return getGameName();

    case DICT:
      return getDict();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BOARD:
      return isSetBoard();
    case SCORES:
      return isSetScores();
    case PLAYER_TURN:
      return isSetPlayerTurn();
    case TURN_ORDER:
      return isSetTurnOrder();
    case HISTORY:
      return isSetHistory();
    case GAME_NAME:
      return isSetGameName();
    case DICT:
      return isSetDict();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Gamestate)
      return this.equals((Gamestate)that);
    return false;
  }

  public boolean equals(Gamestate that) {
    if (that == null)
      return false;

    boolean this_present_board = true && this.isSetBoard();
    boolean that_present_board = true && that.isSetBoard();
    if (this_present_board || that_present_board) {
      if (!(this_present_board && that_present_board))
        return false;
      if (!this.board.equals(that.board))
        return false;
    }

    boolean this_present_scores = true && this.isSetScores();
    boolean that_present_scores = true && that.isSetScores();
    if (this_present_scores || that_present_scores) {
      if (!(this_present_scores && that_present_scores))
        return false;
      if (!this.scores.equals(that.scores))
        return false;
    }

    boolean this_present_player_turn = true && this.isSetPlayerTurn();
    boolean that_present_player_turn = true && that.isSetPlayerTurn();
    if (this_present_player_turn || that_present_player_turn) {
      if (!(this_present_player_turn && that_present_player_turn))
        return false;
      if (!this.player_turn.equals(that.player_turn))
        return false;
    }

    boolean this_present_turn_order = true && this.isSetTurnOrder();
    boolean that_present_turn_order = true && that.isSetTurnOrder();
    if (this_present_turn_order || that_present_turn_order) {
      if (!(this_present_turn_order && that_present_turn_order))
        return false;
      if (!this.turn_order.equals(that.turn_order))
        return false;
    }

    boolean this_present_history = true && this.isSetHistory();
    boolean that_present_history = true && that.isSetHistory();
    if (this_present_history || that_present_history) {
      if (!(this_present_history && that_present_history))
        return false;
      if (!this.history.equals(that.history))
        return false;
    }

    boolean this_present_game_name = true && this.isSetGameName();
    boolean that_present_game_name = true && that.isSetGameName();
    if (this_present_game_name || that_present_game_name) {
      if (!(this_present_game_name && that_present_game_name))
        return false;
      if (!this.game_name.equals(that.game_name))
        return false;
    }

    boolean this_present_dict = true && this.isSetDict();
    boolean that_present_dict = true && that.isSetDict();
    if (this_present_dict || that_present_dict) {
      if (!(this_present_dict && that_present_dict))
        return false;
      if (!this.dict.equals(that.dict))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_board = true && (isSetBoard());
    list.add(present_board);
    if (present_board)
      list.add(board);

    boolean present_scores = true && (isSetScores());
    list.add(present_scores);
    if (present_scores)
      list.add(scores);

    boolean present_player_turn = true && (isSetPlayerTurn());
    list.add(present_player_turn);
    if (present_player_turn)
      list.add(player_turn);

    boolean present_turn_order = true && (isSetTurnOrder());
    list.add(present_turn_order);
    if (present_turn_order)
      list.add(turn_order);

    boolean present_history = true && (isSetHistory());
    list.add(present_history);
    if (present_history)
      list.add(history);

    boolean present_game_name = true && (isSetGameName());
    list.add(present_game_name);
    if (present_game_name)
      list.add(game_name.getValue());

    boolean present_dict = true && (isSetDict());
    list.add(present_dict);
    if (present_dict)
      list.add(dict.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(Gamestate other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBoard()).compareTo(other.isSetBoard());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBoard()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.board, other.board);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetScores()).compareTo(other.isSetScores());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScores()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scores, other.scores);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPlayerTurn()).compareTo(other.isSetPlayerTurn());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPlayerTurn()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.player_turn, other.player_turn);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTurnOrder()).compareTo(other.isSetTurnOrder());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTurnOrder()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.turn_order, other.turn_order);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHistory()).compareTo(other.isSetHistory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHistory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.history, other.history);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGameName()).compareTo(other.isSetGameName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGameName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.game_name, other.game_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDict()).compareTo(other.isSetDict());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDict()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dict, other.dict);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Gamestate(");
    boolean first = true;

    sb.append("board:");
    if (this.board == null) {
      sb.append("null");
    } else {
      sb.append(this.board);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("scores:");
    if (this.scores == null) {
      sb.append("null");
    } else {
      sb.append(this.scores);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("player_turn:");
    if (this.player_turn == null) {
      sb.append("null");
    } else {
      sb.append(this.player_turn);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("turn_order:");
    if (this.turn_order == null) {
      sb.append("null");
    } else {
      sb.append(this.turn_order);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("history:");
    if (this.history == null) {
      sb.append("null");
    } else {
      sb.append(this.history);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("game_name:");
    if (this.game_name == null) {
      sb.append("null");
    } else {
      sb.append(this.game_name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dict:");
    if (this.dict == null) {
      sb.append("null");
    } else {
      sb.append(this.dict);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GamestateStandardSchemeFactory implements SchemeFactory {
    public GamestateStandardScheme getScheme() {
      return new GamestateStandardScheme();
    }
  }

  private static class GamestateStandardScheme extends StandardScheme<Gamestate> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Gamestate struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BOARD
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list54 = iprot.readListBegin();
                struct.board = new ArrayList<Tile>(_list54.size);
                Tile _elem55;
                for (int _i56 = 0; _i56 < _list54.size; ++_i56)
                {
                  _elem55 = new Tile();
                  _elem55.read(iprot);
                  struct.board.add(_elem55);
                }
                iprot.readListEnd();
              }
              struct.setBoardIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SCORES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map57 = iprot.readMapBegin();
                struct.scores = new HashMap<String,Short>(2*_map57.size);
                String _key58;
                short _val59;
                for (int _i60 = 0; _i60 < _map57.size; ++_i60)
                {
                  _key58 = iprot.readString();
                  _val59 = iprot.readI16();
                  struct.scores.put(_key58, _val59);
                }
                iprot.readMapEnd();
              }
              struct.setScoresIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PLAYER_TURN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.player_turn = iprot.readString();
              struct.setPlayerTurnIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TURN_ORDER
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list61 = iprot.readListBegin();
                struct.turn_order = new ArrayList<String>(_list61.size);
                String _elem62;
                for (int _i63 = 0; _i63 < _list61.size; ++_i63)
                {
                  _elem62 = iprot.readString();
                  struct.turn_order.add(_elem62);
                }
                iprot.readListEnd();
              }
              struct.setTurnOrderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // HISTORY
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list64 = iprot.readListBegin();
                struct.history = new ArrayList<Turn>(_list64.size);
                Turn _elem65;
                for (int _i66 = 0; _i66 < _list64.size; ++_i66)
                {
                  _elem65 = new Turn();
                  _elem65.read(iprot);
                  struct.history.add(_elem65);
                }
                iprot.readListEnd();
              }
              struct.setHistoryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // GAME_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.game_name = GameName.findByValue(iprot.readI32());
              struct.setGameNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // DICT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.dict = Dictionary.findByValue(iprot.readI32());
              struct.setDictIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Gamestate struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.board != null) {
        oprot.writeFieldBegin(BOARD_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.board.size()));
          for (Tile _iter67 : struct.board)
          {
            _iter67.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.scores != null) {
        oprot.writeFieldBegin(SCORES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I16, struct.scores.size()));
          for (Map.Entry<String, Short> _iter68 : struct.scores.entrySet())
          {
            oprot.writeString(_iter68.getKey());
            oprot.writeI16(_iter68.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.player_turn != null) {
        oprot.writeFieldBegin(PLAYER_TURN_FIELD_DESC);
        oprot.writeString(struct.player_turn);
        oprot.writeFieldEnd();
      }
      if (struct.turn_order != null) {
        oprot.writeFieldBegin(TURN_ORDER_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.turn_order.size()));
          for (String _iter69 : struct.turn_order)
          {
            oprot.writeString(_iter69);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.history != null) {
        oprot.writeFieldBegin(HISTORY_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.history.size()));
          for (Turn _iter70 : struct.history)
          {
            _iter70.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.game_name != null) {
        oprot.writeFieldBegin(GAME_NAME_FIELD_DESC);
        oprot.writeI32(struct.game_name.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.dict != null) {
        oprot.writeFieldBegin(DICT_FIELD_DESC);
        oprot.writeI32(struct.dict.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GamestateTupleSchemeFactory implements SchemeFactory {
    public GamestateTupleScheme getScheme() {
      return new GamestateTupleScheme();
    }
  }

  private static class GamestateTupleScheme extends TupleScheme<Gamestate> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Gamestate struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBoard()) {
        optionals.set(0);
      }
      if (struct.isSetScores()) {
        optionals.set(1);
      }
      if (struct.isSetPlayerTurn()) {
        optionals.set(2);
      }
      if (struct.isSetTurnOrder()) {
        optionals.set(3);
      }
      if (struct.isSetHistory()) {
        optionals.set(4);
      }
      if (struct.isSetGameName()) {
        optionals.set(5);
      }
      if (struct.isSetDict()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetBoard()) {
        {
          oprot.writeI32(struct.board.size());
          for (Tile _iter71 : struct.board)
          {
            _iter71.write(oprot);
          }
        }
      }
      if (struct.isSetScores()) {
        {
          oprot.writeI32(struct.scores.size());
          for (Map.Entry<String, Short> _iter72 : struct.scores.entrySet())
          {
            oprot.writeString(_iter72.getKey());
            oprot.writeI16(_iter72.getValue());
          }
        }
      }
      if (struct.isSetPlayerTurn()) {
        oprot.writeString(struct.player_turn);
      }
      if (struct.isSetTurnOrder()) {
        {
          oprot.writeI32(struct.turn_order.size());
          for (String _iter73 : struct.turn_order)
          {
            oprot.writeString(_iter73);
          }
        }
      }
      if (struct.isSetHistory()) {
        {
          oprot.writeI32(struct.history.size());
          for (Turn _iter74 : struct.history)
          {
            _iter74.write(oprot);
          }
        }
      }
      if (struct.isSetGameName()) {
        oprot.writeI32(struct.game_name.getValue());
      }
      if (struct.isSetDict()) {
        oprot.writeI32(struct.dict.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Gamestate struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list75 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.board = new ArrayList<Tile>(_list75.size);
          Tile _elem76;
          for (int _i77 = 0; _i77 < _list75.size; ++_i77)
          {
            _elem76 = new Tile();
            _elem76.read(iprot);
            struct.board.add(_elem76);
          }
        }
        struct.setBoardIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map78 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.I16, iprot.readI32());
          struct.scores = new HashMap<String,Short>(2*_map78.size);
          String _key79;
          short _val80;
          for (int _i81 = 0; _i81 < _map78.size; ++_i81)
          {
            _key79 = iprot.readString();
            _val80 = iprot.readI16();
            struct.scores.put(_key79, _val80);
          }
        }
        struct.setScoresIsSet(true);
      }
      if (incoming.get(2)) {
        struct.player_turn = iprot.readString();
        struct.setPlayerTurnIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list82 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.turn_order = new ArrayList<String>(_list82.size);
          String _elem83;
          for (int _i84 = 0; _i84 < _list82.size; ++_i84)
          {
            _elem83 = iprot.readString();
            struct.turn_order.add(_elem83);
          }
        }
        struct.setTurnOrderIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list85 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.history = new ArrayList<Turn>(_list85.size);
          Turn _elem86;
          for (int _i87 = 0; _i87 < _list85.size; ++_i87)
          {
            _elem86 = new Turn();
            _elem86.read(iprot);
            struct.history.add(_elem86);
          }
        }
        struct.setHistoryIsSet(true);
      }
      if (incoming.get(5)) {
        struct.game_name = GameName.findByValue(iprot.readI32());
        struct.setGameNameIsSet(true);
      }
      if (incoming.get(6)) {
        struct.dict = Dictionary.findByValue(iprot.readI32());
        struct.setDictIsSet(true);
      }
    }
  }

}

