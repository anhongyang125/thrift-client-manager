/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.didi.duse.api;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-06-05")
public class Trace implements org.apache.thrift.TBase<Trace, Trace._Fields>, java.io.Serializable, Cloneable, Comparable<Trace> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Trace");

  private static final org.apache.thrift.protocol.TField LOG_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("logId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CALLER_FIELD_DESC = new org.apache.thrift.protocol.TField("caller", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SPAN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("spanId", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TraceStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TraceTupleSchemeFactory());
  }

  public String logId; // required
  public String caller; // required
  public String spanId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOG_ID((short)1, "logId"),
    CALLER((short)2, "caller"),
    SPAN_ID((short)3, "spanId");

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
        case 1: // LOG_ID
          return LOG_ID;
        case 2: // CALLER
          return CALLER;
        case 3: // SPAN_ID
          return SPAN_ID;
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
  private static final _Fields optionals[] = {_Fields.SPAN_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOG_ID, new org.apache.thrift.meta_data.FieldMetaData("logId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CALLER, new org.apache.thrift.meta_data.FieldMetaData("caller", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SPAN_ID, new org.apache.thrift.meta_data.FieldMetaData("spanId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Trace.class, metaDataMap);
  }

  public Trace() {
  }

  public Trace(
    String logId,
    String caller)
  {
    this();
    this.logId = logId;
    this.caller = caller;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Trace(Trace other) {
    if (other.isSetLogId()) {
      this.logId = other.logId;
    }
    if (other.isSetCaller()) {
      this.caller = other.caller;
    }
    if (other.isSetSpanId()) {
      this.spanId = other.spanId;
    }
  }

  public Trace deepCopy() {
    return new Trace(this);
  }

  @Override
  public void clear() {
    this.logId = null;
    this.caller = null;
    this.spanId = null;
  }

  public String getLogId() {
    return this.logId;
  }

  public Trace setLogId(String logId) {
    this.logId = logId;
    return this;
  }

  public void unsetLogId() {
    this.logId = null;
  }

  /** Returns true if field logId is set (has been assigned a value) and false otherwise */
  public boolean isSetLogId() {
    return this.logId != null;
  }

  public void setLogIdIsSet(boolean value) {
    if (!value) {
      this.logId = null;
    }
  }

  public String getCaller() {
    return this.caller;
  }

  public Trace setCaller(String caller) {
    this.caller = caller;
    return this;
  }

  public void unsetCaller() {
    this.caller = null;
  }

  /** Returns true if field caller is set (has been assigned a value) and false otherwise */
  public boolean isSetCaller() {
    return this.caller != null;
  }

  public void setCallerIsSet(boolean value) {
    if (!value) {
      this.caller = null;
    }
  }

  public String getSpanId() {
    return this.spanId;
  }

  public Trace setSpanId(String spanId) {
    this.spanId = spanId;
    return this;
  }

  public void unsetSpanId() {
    this.spanId = null;
  }

  /** Returns true if field spanId is set (has been assigned a value) and false otherwise */
  public boolean isSetSpanId() {
    return this.spanId != null;
  }

  public void setSpanIdIsSet(boolean value) {
    if (!value) {
      this.spanId = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOG_ID:
      if (value == null) {
        unsetLogId();
      } else {
        setLogId((String)value);
      }
      break;

    case CALLER:
      if (value == null) {
        unsetCaller();
      } else {
        setCaller((String)value);
      }
      break;

    case SPAN_ID:
      if (value == null) {
        unsetSpanId();
      } else {
        setSpanId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOG_ID:
      return getLogId();

    case CALLER:
      return getCaller();

    case SPAN_ID:
      return getSpanId();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOG_ID:
      return isSetLogId();
    case CALLER:
      return isSetCaller();
    case SPAN_ID:
      return isSetSpanId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Trace)
      return this.equals((Trace)that);
    return false;
  }

  public boolean equals(Trace that) {
    if (that == null)
      return false;

    boolean this_present_logId = true && this.isSetLogId();
    boolean that_present_logId = true && that.isSetLogId();
    if (this_present_logId || that_present_logId) {
      if (!(this_present_logId && that_present_logId))
        return false;
      if (!this.logId.equals(that.logId))
        return false;
    }

    boolean this_present_caller = true && this.isSetCaller();
    boolean that_present_caller = true && that.isSetCaller();
    if (this_present_caller || that_present_caller) {
      if (!(this_present_caller && that_present_caller))
        return false;
      if (!this.caller.equals(that.caller))
        return false;
    }

    boolean this_present_spanId = true && this.isSetSpanId();
    boolean that_present_spanId = true && that.isSetSpanId();
    if (this_present_spanId || that_present_spanId) {
      if (!(this_present_spanId && that_present_spanId))
        return false;
      if (!this.spanId.equals(that.spanId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_logId = true && (isSetLogId());
    list.add(present_logId);
    if (present_logId)
      list.add(logId);

    boolean present_caller = true && (isSetCaller());
    list.add(present_caller);
    if (present_caller)
      list.add(caller);

    boolean present_spanId = true && (isSetSpanId());
    list.add(present_spanId);
    if (present_spanId)
      list.add(spanId);

    return list.hashCode();
  }

  @Override
  public int compareTo(Trace other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLogId()).compareTo(other.isSetLogId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLogId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.logId, other.logId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCaller()).compareTo(other.isSetCaller());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCaller()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.caller, other.caller);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSpanId()).compareTo(other.isSetSpanId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpanId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.spanId, other.spanId);
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
    StringBuilder sb = new StringBuilder("Trace(");
    boolean first = true;

    sb.append("logId:");
    if (this.logId == null) {
      sb.append("null");
    } else {
      sb.append(this.logId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("caller:");
    if (this.caller == null) {
      sb.append("null");
    } else {
      sb.append(this.caller);
    }
    first = false;
    if (isSetSpanId()) {
      if (!first) sb.append(", ");
      sb.append("spanId:");
      if (this.spanId == null) {
        sb.append("null");
      } else {
        sb.append(this.spanId);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (logId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'logId' was not present! Struct: " + toString());
    }
    if (caller == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'caller' was not present! Struct: " + toString());
    }
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

  private static class TraceStandardSchemeFactory implements SchemeFactory {
    public TraceStandardScheme getScheme() {
      return new TraceStandardScheme();
    }
  }

  private static class TraceStandardScheme extends StandardScheme<Trace> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Trace struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOG_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.logId = iprot.readString();
              struct.setLogIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CALLER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.caller = iprot.readString();
              struct.setCallerIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SPAN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.spanId = iprot.readString();
              struct.setSpanIdIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Trace struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.logId != null) {
        oprot.writeFieldBegin(LOG_ID_FIELD_DESC);
        oprot.writeString(struct.logId);
        oprot.writeFieldEnd();
      }
      if (struct.caller != null) {
        oprot.writeFieldBegin(CALLER_FIELD_DESC);
        oprot.writeString(struct.caller);
        oprot.writeFieldEnd();
      }
      if (struct.spanId != null) {
        if (struct.isSetSpanId()) {
          oprot.writeFieldBegin(SPAN_ID_FIELD_DESC);
          oprot.writeString(struct.spanId);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TraceTupleSchemeFactory implements SchemeFactory {
    public TraceTupleScheme getScheme() {
      return new TraceTupleScheme();
    }
  }

  private static class TraceTupleScheme extends TupleScheme<Trace> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Trace struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.logId);
      oprot.writeString(struct.caller);
      BitSet optionals = new BitSet();
      if (struct.isSetSpanId()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSpanId()) {
        oprot.writeString(struct.spanId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Trace struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.logId = iprot.readString();
      struct.setLogIdIsSet(true);
      struct.caller = iprot.readString();
      struct.setCallerIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.spanId = iprot.readString();
        struct.setSpanIdIsSet(true);
      }
    }
  }

}

