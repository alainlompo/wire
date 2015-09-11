// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/simple_message.proto at 24:1
package com.squareup.wire.protos.simple;

import com.squareup.wire.Message;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.protos.foreign.ForeignEnum;
import java.lang.Deprecated;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.List;

/**
 * A message for testing.
 */
public final class SimpleMessage extends Message<SimpleMessage> {
  private static final long serialVersionUID = 0L;

  public static final Integer DEFAULT_OPTIONAL_INT32 = 123;

  public static final NestedEnum DEFAULT_DEFAULT_NESTED_ENUM = NestedEnum.BAZ;

  public static final Integer DEFAULT_REQUIRED_INT32 = 456;

  public static final ForeignEnum DEFAULT_DEFAULT_FOREIGN_ENUM = ForeignEnum.BAX;

  public static final ForeignEnum DEFAULT_NO_DEFAULT_FOREIGN_ENUM = ForeignEnum.BAV;

  public static final String DEFAULT_PACKAGE = "";

  public static final String DEFAULT_RESULT = "";

  public static final String DEFAULT_OTHER = "";

  public static final String DEFAULT_O = "";

  /**
   * An optional int32
   */
  @WireField(
      tag = 1,
      type = "int32"
  )
  public final Integer optional_int32;

  /**
   * An optional NestedMessage, deprecated
   */
  @WireField(
      tag = 2,
      type = "squareup.protos.simple.SimpleMessage.NestedMessage",
      deprecated = true
  )
  @Deprecated
  public final NestedMessage optional_nested_msg;

  /**
   * An optional ExternalMessage
   */
  @WireField(
      tag = 3,
      type = "squareup.protos.simple.ExternalMessage"
  )
  public final ExternalMessage optional_external_msg;

  @WireField(
      tag = 4,
      type = "squareup.protos.simple.SimpleMessage.NestedEnum"
  )
  public final NestedEnum default_nested_enum;

  /**
   * A required int32
   */
  @WireField(
      tag = 5,
      type = "int32",
      label = Message.Label.REQUIRED
  )
  public final Integer required_int32;

  /**
   * A repeated double, deprecated
   */
  @WireField(
      tag = 6,
      type = "double",
      label = Message.Label.REPEATED,
      deprecated = true
  )
  @Deprecated
  public final List<Double> repeated_double;

  /**
   * enum from another package with an explicit default
   */
  @WireField(
      tag = 7,
      type = "squareup.protos.foreign.ForeignEnum"
  )
  public final ForeignEnum default_foreign_enum;

  /**
   * enum from another package without an explicit default
   */
  @WireField(
      tag = 8,
      type = "squareup.protos.foreign.ForeignEnum"
  )
  public final ForeignEnum no_default_foreign_enum;

  /**
   * field with the same name as a Java keyword
   */
  @WireField(
      tag = 9,
      type = "string"
  )
  public final String _package;

  /**
   * field with the name "result"
   */
  @WireField(
      tag = 10,
      type = "string"
  )
  public final String result;

  /**
   * field with the name "other"
   */
  @WireField(
      tag = 11,
      type = "string"
  )
  public final String other;

  /**
   * field with the name "o"
   */
  @WireField(
      tag = 12,
      type = "string"
  )
  public final String o;

  public SimpleMessage(Integer optional_int32, NestedMessage optional_nested_msg, ExternalMessage optional_external_msg, NestedEnum default_nested_enum, Integer required_int32, List<Double> repeated_double, ForeignEnum default_foreign_enum, ForeignEnum no_default_foreign_enum, String _package, String result, String other, String o) {
    this.optional_int32 = optional_int32;
    this.optional_nested_msg = optional_nested_msg;
    this.optional_external_msg = optional_external_msg;
    this.default_nested_enum = default_nested_enum;
    this.required_int32 = required_int32;
    this.repeated_double = immutableCopyOf(repeated_double);
    this.default_foreign_enum = default_foreign_enum;
    this.no_default_foreign_enum = no_default_foreign_enum;
    this._package = _package;
    this.result = result;
    this.other = other;
    this.o = o;
  }

  private SimpleMessage(Builder builder) {
    this(builder.optional_int32, builder.optional_nested_msg, builder.optional_external_msg, builder.default_nested_enum, builder.required_int32, builder.repeated_double, builder.default_foreign_enum, builder.no_default_foreign_enum, builder._package, builder.result, builder.other, builder.o);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SimpleMessage)) return false;
    SimpleMessage o = (SimpleMessage) other;
    return equals(optional_int32, o.optional_int32)
        && equals(optional_nested_msg, o.optional_nested_msg)
        && equals(optional_external_msg, o.optional_external_msg)
        && equals(default_nested_enum, o.default_nested_enum)
        && equals(required_int32, o.required_int32)
        && equals(repeated_double, o.repeated_double)
        && equals(default_foreign_enum, o.default_foreign_enum)
        && equals(no_default_foreign_enum, o.no_default_foreign_enum)
        && equals(_package, o._package)
        && equals(result, o.result)
        && equals(this.other, o.other)
        && equals(this.o, o.o);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = optional_int32 != null ? optional_int32.hashCode() : 0;
      result = result * 37 + (optional_nested_msg != null ? optional_nested_msg.hashCode() : 0);
      result = result * 37 + (optional_external_msg != null ? optional_external_msg.hashCode() : 0);
      result = result * 37 + (default_nested_enum != null ? default_nested_enum.hashCode() : 0);
      result = result * 37 + (required_int32 != null ? required_int32.hashCode() : 0);
      result = result * 37 + (repeated_double != null ? repeated_double.hashCode() : 1);
      result = result * 37 + (default_foreign_enum != null ? default_foreign_enum.hashCode() : 0);
      result = result * 37 + (no_default_foreign_enum != null ? no_default_foreign_enum.hashCode() : 0);
      result = result * 37 + (_package != null ? _package.hashCode() : 0);
      result = result * 37 + (this.result != null ? this.result.hashCode() : 0);
      result = result * 37 + (other != null ? other.hashCode() : 0);
      result = result * 37 + (o != null ? o.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<SimpleMessage, Builder> {
    public Integer optional_int32;

    public NestedMessage optional_nested_msg;

    public ExternalMessage optional_external_msg;

    public NestedEnum default_nested_enum;

    public Integer required_int32;

    public List<Double> repeated_double = Collections.emptyList();

    public ForeignEnum default_foreign_enum;

    public ForeignEnum no_default_foreign_enum;

    public String _package;

    public String result;

    public String other;

    public String o;

    public Builder() {
    }

    public Builder(SimpleMessage message) {
      super(message);
      if (message == null) return;
      this.optional_int32 = message.optional_int32;
      this.optional_nested_msg = message.optional_nested_msg;
      this.optional_external_msg = message.optional_external_msg;
      this.default_nested_enum = message.default_nested_enum;
      this.required_int32 = message.required_int32;
      this.repeated_double = copyOf(message.repeated_double);
      this.default_foreign_enum = message.default_foreign_enum;
      this.no_default_foreign_enum = message.no_default_foreign_enum;
      this._package = message._package;
      this.result = message.result;
      this.other = message.other;
      this.o = message.o;
    }

    /**
     * An optional int32
     */
    public Builder optional_int32(Integer optional_int32) {
      this.optional_int32 = optional_int32;
      return this;
    }

    /**
     * An optional NestedMessage, deprecated
     */
    @Deprecated
    public Builder optional_nested_msg(NestedMessage optional_nested_msg) {
      this.optional_nested_msg = optional_nested_msg;
      return this;
    }

    /**
     * An optional ExternalMessage
     */
    public Builder optional_external_msg(ExternalMessage optional_external_msg) {
      this.optional_external_msg = optional_external_msg;
      return this;
    }

    public Builder default_nested_enum(NestedEnum default_nested_enum) {
      this.default_nested_enum = default_nested_enum;
      return this;
    }

    /**
     * A required int32
     */
    public Builder required_int32(Integer required_int32) {
      this.required_int32 = required_int32;
      return this;
    }

    /**
     * A repeated double, deprecated
     */
    @Deprecated
    public Builder repeated_double(List<Double> repeated_double) {
      this.repeated_double = canonicalizeList(repeated_double);
      return this;
    }

    /**
     * enum from another package with an explicit default
     */
    public Builder default_foreign_enum(ForeignEnum default_foreign_enum) {
      this.default_foreign_enum = default_foreign_enum;
      return this;
    }

    /**
     * enum from another package without an explicit default
     */
    public Builder no_default_foreign_enum(ForeignEnum no_default_foreign_enum) {
      this.no_default_foreign_enum = no_default_foreign_enum;
      return this;
    }

    /**
     * field with the same name as a Java keyword
     */
    public Builder _package(String _package) {
      this._package = _package;
      return this;
    }

    /**
     * field with the name "result"
     */
    public Builder result(String result) {
      this.result = result;
      return this;
    }

    /**
     * field with the name "other"
     */
    public Builder other(String other) {
      this.other = other;
      return this;
    }

    /**
     * field with the name "o"
     */
    public Builder o(String o) {
      this.o = o;
      return this;
    }

    @Override
    public SimpleMessage build() {
      if (required_int32 == null) {
        throw missingRequiredFields(required_int32, "required_int32");
      }
      return new SimpleMessage(this);
    }
  }

  public static final class NestedMessage extends Message<NestedMessage> {
    private static final long serialVersionUID = 0L;

    public static final Integer DEFAULT_BB = 0;

    /**
     * An optional int32
     */
    @WireField(
        tag = 1,
        type = "int32"
    )
    public final Integer bb;

    public NestedMessage(Integer bb) {
      this.bb = bb;
    }

    private NestedMessage(Builder builder) {
      this(builder.bb);
      setBuilder(builder);
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof NestedMessage)) return false;
      return equals(bb, ((NestedMessage) other).bb);
    }

    @Override
    public int hashCode() {
      int result = hashCode;
      return result != 0 ? result : (hashCode = bb != null ? bb.hashCode() : 0);
    }

    public static final class Builder extends com.squareup.wire.Message.Builder<NestedMessage, Builder> {
      public Integer bb;

      public Builder() {
      }

      public Builder(NestedMessage message) {
        super(message);
        if (message == null) return;
        this.bb = message.bb;
      }

      /**
       * An optional int32
       */
      public Builder bb(Integer bb) {
        this.bb = bb;
        return this;
      }

      @Override
      public NestedMessage build() {
        return new NestedMessage(this);
      }
    }
  }

  public enum NestedEnum implements WireEnum {
    FOO(1),

    BAR(2),

    BAZ(3);

    private final int value;

    NestedEnum(int value) {
      this.value = value;
    }

    @Override
    public int getValue() {
      return value;
    }
  }
}
