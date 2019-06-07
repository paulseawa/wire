// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: form.proto
package com.squareup.wire.protos.kotlin

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.TagHandler
import com.squareup.wire.WireField
import com.squareup.wire.internal.countNonNull
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.jvm.JvmField
import okio.ByteString

data class Form(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.protos.kotlin.Form${'$'}ButtonElement#ADAPTER"
  )
  val button_element: ButtonElement? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.protos.kotlin.Form${'$'}LocalImageElement#ADAPTER"
  )
  val local_image_element: LocalImageElement? = null,
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.protos.kotlin.Form${'$'}RemoteImageElement#ADAPTER"
  )
  val remote_image_element: RemoteImageElement? = null,
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.protos.kotlin.Form${'$'}MoneyElement#ADAPTER"
  )
  val money_element: MoneyElement? = null,
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.protos.kotlin.Form${'$'}SpacerElement#ADAPTER"
  )
  val spacer_element: SpacerElement? = null,
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.protos.kotlin.Form${'$'}TextElement#ADAPTER"
  )
  val text_element: TextElement? = null,
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.protos.kotlin.Form${'$'}CustomizedCardElement#ADAPTER"
  )
  val customized_card_element: CustomizedCardElement? = null,
  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.protos.kotlin.Form${'$'}AddressElement#ADAPTER"
  )
  val address_element: AddressElement? = null,
  @field:WireField(
    tag = 9,
    adapter = "com.squareup.wire.protos.kotlin.Form${'$'}TextInputElement#ADAPTER"
  )
  val text_input_element: TextInputElement? = null,
  @field:WireField(
    tag = 10,
    adapter = "com.squareup.wire.protos.kotlin.Form${'$'}OptionPickerElement#ADAPTER"
  )
  val option_picker_element: OptionPickerElement? = null,
  @field:WireField(
    tag = 11,
    adapter = "com.squareup.wire.protos.kotlin.Form${'$'}DetailRowElement#ADAPTER"
  )
  val detail_row_element: DetailRowElement? = null,
  @field:WireField(
    tag = 12,
    adapter = "com.squareup.wire.protos.kotlin.Form${'$'}CurrencyConversionFlagsElement#ADAPTER"
  )
  val currency_conversion_flags_element: CurrencyConversionFlagsElement? = null,
  val unknownFields: ByteString = ByteString.EMPTY
) : Message<Form, Form.Builder>(ADAPTER, unknownFields) {
  init {
    require(countNonNull(button_element, local_image_element, remote_image_element, money_element,
        spacer_element, text_element, customized_card_element, address_element, text_input_element,
        option_picker_element, detail_row_element, currency_conversion_flags_element) <= 1) {
      "At most one of button_element, local_image_element, remote_image_element, money_element, spacer_element, text_element, customized_card_element, address_element, text_input_element, option_picker_element, detail_row_element, currency_conversion_flags_element may be non-null"
    }
  }

  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN
  )
  override fun newBuilder(): Builder = Builder(this.copy())

  class Builder(
    private val message: Form
  ) : Message.Builder<Form, Builder>() {
    override fun build(): Form = message
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<Form> = object : ProtoAdapter<Form>(
      FieldEncoding.LENGTH_DELIMITED, 
      Form::class
    ) {
      override fun encodedSize(value: Form): Int = 
        ButtonElement.ADAPTER.encodedSizeWithTag(1, value.button_element) +
        LocalImageElement.ADAPTER.encodedSizeWithTag(2, value.local_image_element) +
        RemoteImageElement.ADAPTER.encodedSizeWithTag(3, value.remote_image_element) +
        MoneyElement.ADAPTER.encodedSizeWithTag(4, value.money_element) +
        SpacerElement.ADAPTER.encodedSizeWithTag(5, value.spacer_element) +
        TextElement.ADAPTER.encodedSizeWithTag(6, value.text_element) +
        CustomizedCardElement.ADAPTER.encodedSizeWithTag(7, value.customized_card_element) +
        AddressElement.ADAPTER.encodedSizeWithTag(8, value.address_element) +
        TextInputElement.ADAPTER.encodedSizeWithTag(9, value.text_input_element) +
        OptionPickerElement.ADAPTER.encodedSizeWithTag(10, value.option_picker_element) +
        DetailRowElement.ADAPTER.encodedSizeWithTag(11, value.detail_row_element) +
        CurrencyConversionFlagsElement.ADAPTER.encodedSizeWithTag(12,
            value.currency_conversion_flags_element) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: Form) {
        ButtonElement.ADAPTER.encodeWithTag(writer, 1, value.button_element)
        LocalImageElement.ADAPTER.encodeWithTag(writer, 2, value.local_image_element)
        RemoteImageElement.ADAPTER.encodeWithTag(writer, 3, value.remote_image_element)
        MoneyElement.ADAPTER.encodeWithTag(writer, 4, value.money_element)
        SpacerElement.ADAPTER.encodeWithTag(writer, 5, value.spacer_element)
        TextElement.ADAPTER.encodeWithTag(writer, 6, value.text_element)
        CustomizedCardElement.ADAPTER.encodeWithTag(writer, 7, value.customized_card_element)
        AddressElement.ADAPTER.encodeWithTag(writer, 8, value.address_element)
        TextInputElement.ADAPTER.encodeWithTag(writer, 9, value.text_input_element)
        OptionPickerElement.ADAPTER.encodeWithTag(writer, 10, value.option_picker_element)
        DetailRowElement.ADAPTER.encodeWithTag(writer, 11, value.detail_row_element)
        CurrencyConversionFlagsElement.ADAPTER.encodeWithTag(writer, 12,
            value.currency_conversion_flags_element)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): Form {
        var button_element: ButtonElement? = null
        var local_image_element: LocalImageElement? = null
        var remote_image_element: RemoteImageElement? = null
        var money_element: MoneyElement? = null
        var spacer_element: SpacerElement? = null
        var text_element: TextElement? = null
        var customized_card_element: CustomizedCardElement? = null
        var address_element: AddressElement? = null
        var text_input_element: TextInputElement? = null
        var option_picker_element: OptionPickerElement? = null
        var detail_row_element: DetailRowElement? = null
        var currency_conversion_flags_element: CurrencyConversionFlagsElement? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> button_element = ButtonElement.ADAPTER.decode(reader)
            2 -> local_image_element = LocalImageElement.ADAPTER.decode(reader)
            3 -> remote_image_element = RemoteImageElement.ADAPTER.decode(reader)
            4 -> money_element = MoneyElement.ADAPTER.decode(reader)
            5 -> spacer_element = SpacerElement.ADAPTER.decode(reader)
            6 -> text_element = TextElement.ADAPTER.decode(reader)
            7 -> customized_card_element = CustomizedCardElement.ADAPTER.decode(reader)
            8 -> address_element = AddressElement.ADAPTER.decode(reader)
            9 -> text_input_element = TextInputElement.ADAPTER.decode(reader)
            10 -> option_picker_element = OptionPickerElement.ADAPTER.decode(reader)
            11 -> detail_row_element = DetailRowElement.ADAPTER.decode(reader)
            12 -> currency_conversion_flags_element =
                CurrencyConversionFlagsElement.ADAPTER.decode(reader)
            else -> TagHandler.UNKNOWN_TAG
          }
        }
        return Form(
          button_element = button_element,
          local_image_element = local_image_element,
          remote_image_element = remote_image_element,
          money_element = money_element,
          spacer_element = spacer_element,
          text_element = text_element,
          customized_card_element = customized_card_element,
          address_element = address_element,
          text_input_element = text_input_element,
          option_picker_element = option_picker_element,
          detail_row_element = detail_row_element,
          currency_conversion_flags_element = currency_conversion_flags_element,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: Form): Form = value.copy(
        button_element = value.button_element?.let(ButtonElement.ADAPTER::redact),
        local_image_element = value.local_image_element?.let(LocalImageElement.ADAPTER::redact),
        remote_image_element = value.remote_image_element?.let(RemoteImageElement.ADAPTER::redact),
        money_element = value.money_element?.let(MoneyElement.ADAPTER::redact),
        spacer_element = value.spacer_element?.let(SpacerElement.ADAPTER::redact),
        text_element = value.text_element?.let(TextElement.ADAPTER::redact),
        customized_card_element =
            value.customized_card_element?.let(CustomizedCardElement.ADAPTER::redact),
        address_element = value.address_element?.let(AddressElement.ADAPTER::redact),
        text_input_element = value.text_input_element?.let(TextInputElement.ADAPTER::redact),
        option_picker_element =
            value.option_picker_element?.let(OptionPickerElement.ADAPTER::redact),
        detail_row_element = value.detail_row_element?.let(DetailRowElement.ADAPTER::redact),
        currency_conversion_flags_element =
            value.currency_conversion_flags_element?.let(CurrencyConversionFlagsElement.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }
  }

  data class ButtonElement(
    val unknownFields: ByteString = ByteString.EMPTY
  ) : Message<ButtonElement, ButtonElement.Builder>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Builder = Builder(this.copy())

    class Builder(
      private val message: ButtonElement
    ) : Message.Builder<ButtonElement, Builder>() {
      override fun build(): ButtonElement = message
    }

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<ButtonElement> = object : ProtoAdapter<ButtonElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        ButtonElement::class
      ) {
        override fun encodedSize(value: ButtonElement): Int = 
          value.unknownFields.size

        override fun encode(writer: ProtoWriter, value: ButtonElement) {
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): ButtonElement {
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              else -> TagHandler.UNKNOWN_TAG
            }
          }
          return ButtonElement(
            unknownFields = unknownFields
          )
        }

        override fun redact(value: ButtonElement): ButtonElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }
    }
  }

  data class LocalImageElement(
    val unknownFields: ByteString = ByteString.EMPTY
  ) : Message<LocalImageElement, LocalImageElement.Builder>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Builder = Builder(this.copy())

    class Builder(
      private val message: LocalImageElement
    ) : Message.Builder<LocalImageElement, Builder>() {
      override fun build(): LocalImageElement = message
    }

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<LocalImageElement> = object : ProtoAdapter<LocalImageElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        LocalImageElement::class
      ) {
        override fun encodedSize(value: LocalImageElement): Int = 
          value.unknownFields.size

        override fun encode(writer: ProtoWriter, value: LocalImageElement) {
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): LocalImageElement {
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              else -> TagHandler.UNKNOWN_TAG
            }
          }
          return LocalImageElement(
            unknownFields = unknownFields
          )
        }

        override fun redact(value: LocalImageElement): LocalImageElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }
    }
  }

  data class RemoteImageElement(
    val unknownFields: ByteString = ByteString.EMPTY
  ) : Message<RemoteImageElement, RemoteImageElement.Builder>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Builder = Builder(this.copy())

    class Builder(
      private val message: RemoteImageElement
    ) : Message.Builder<RemoteImageElement, Builder>() {
      override fun build(): RemoteImageElement = message
    }

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<RemoteImageElement> = object : ProtoAdapter<RemoteImageElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        RemoteImageElement::class
      ) {
        override fun encodedSize(value: RemoteImageElement): Int = 
          value.unknownFields.size

        override fun encode(writer: ProtoWriter, value: RemoteImageElement) {
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): RemoteImageElement {
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              else -> TagHandler.UNKNOWN_TAG
            }
          }
          return RemoteImageElement(
            unknownFields = unknownFields
          )
        }

        override fun redact(value: RemoteImageElement): RemoteImageElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }
    }
  }

  data class MoneyElement(
    val unknownFields: ByteString = ByteString.EMPTY
  ) : Message<MoneyElement, MoneyElement.Builder>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Builder = Builder(this.copy())

    class Builder(
      private val message: MoneyElement
    ) : Message.Builder<MoneyElement, Builder>() {
      override fun build(): MoneyElement = message
    }

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<MoneyElement> = object : ProtoAdapter<MoneyElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        MoneyElement::class
      ) {
        override fun encodedSize(value: MoneyElement): Int = 
          value.unknownFields.size

        override fun encode(writer: ProtoWriter, value: MoneyElement) {
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): MoneyElement {
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              else -> TagHandler.UNKNOWN_TAG
            }
          }
          return MoneyElement(
            unknownFields = unknownFields
          )
        }

        override fun redact(value: MoneyElement): MoneyElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }
    }
  }

  data class SpacerElement(
    val unknownFields: ByteString = ByteString.EMPTY
  ) : Message<SpacerElement, SpacerElement.Builder>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Builder = Builder(this.copy())

    class Builder(
      private val message: SpacerElement
    ) : Message.Builder<SpacerElement, Builder>() {
      override fun build(): SpacerElement = message
    }

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<SpacerElement> = object : ProtoAdapter<SpacerElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        SpacerElement::class
      ) {
        override fun encodedSize(value: SpacerElement): Int = 
          value.unknownFields.size

        override fun encode(writer: ProtoWriter, value: SpacerElement) {
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): SpacerElement {
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              else -> TagHandler.UNKNOWN_TAG
            }
          }
          return SpacerElement(
            unknownFields = unknownFields
          )
        }

        override fun redact(value: SpacerElement): SpacerElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }
    }
  }

  data class TextElement(
    val unknownFields: ByteString = ByteString.EMPTY
  ) : Message<TextElement, TextElement.Builder>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Builder = Builder(this.copy())

    class Builder(
      private val message: TextElement
    ) : Message.Builder<TextElement, Builder>() {
      override fun build(): TextElement = message
    }

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<TextElement> = object : ProtoAdapter<TextElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        TextElement::class
      ) {
        override fun encodedSize(value: TextElement): Int = 
          value.unknownFields.size

        override fun encode(writer: ProtoWriter, value: TextElement) {
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): TextElement {
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              else -> TagHandler.UNKNOWN_TAG
            }
          }
          return TextElement(
            unknownFields = unknownFields
          )
        }

        override fun redact(value: TextElement): TextElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }
    }
  }

  data class CustomizedCardElement(
    val unknownFields: ByteString = ByteString.EMPTY
  ) : Message<CustomizedCardElement, CustomizedCardElement.Builder>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Builder = Builder(this.copy())

    class Builder(
      private val message: CustomizedCardElement
    ) : Message.Builder<CustomizedCardElement, Builder>() {
      override fun build(): CustomizedCardElement = message
    }

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<CustomizedCardElement> = object :
          ProtoAdapter<CustomizedCardElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        CustomizedCardElement::class
      ) {
        override fun encodedSize(value: CustomizedCardElement): Int = 
          value.unknownFields.size

        override fun encode(writer: ProtoWriter, value: CustomizedCardElement) {
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): CustomizedCardElement {
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              else -> TagHandler.UNKNOWN_TAG
            }
          }
          return CustomizedCardElement(
            unknownFields = unknownFields
          )
        }

        override fun redact(value: CustomizedCardElement): CustomizedCardElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }
    }
  }

  data class AddressElement(
    val unknownFields: ByteString = ByteString.EMPTY
  ) : Message<AddressElement, AddressElement.Builder>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Builder = Builder(this.copy())

    class Builder(
      private val message: AddressElement
    ) : Message.Builder<AddressElement, Builder>() {
      override fun build(): AddressElement = message
    }

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<AddressElement> = object : ProtoAdapter<AddressElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        AddressElement::class
      ) {
        override fun encodedSize(value: AddressElement): Int = 
          value.unknownFields.size

        override fun encode(writer: ProtoWriter, value: AddressElement) {
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): AddressElement {
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              else -> TagHandler.UNKNOWN_TAG
            }
          }
          return AddressElement(
            unknownFields = unknownFields
          )
        }

        override fun redact(value: AddressElement): AddressElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }
    }
  }

  data class TextInputElement(
    val unknownFields: ByteString = ByteString.EMPTY
  ) : Message<TextInputElement, TextInputElement.Builder>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Builder = Builder(this.copy())

    class Builder(
      private val message: TextInputElement
    ) : Message.Builder<TextInputElement, Builder>() {
      override fun build(): TextInputElement = message
    }

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<TextInputElement> = object : ProtoAdapter<TextInputElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        TextInputElement::class
      ) {
        override fun encodedSize(value: TextInputElement): Int = 
          value.unknownFields.size

        override fun encode(writer: ProtoWriter, value: TextInputElement) {
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): TextInputElement {
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              else -> TagHandler.UNKNOWN_TAG
            }
          }
          return TextInputElement(
            unknownFields = unknownFields
          )
        }

        override fun redact(value: TextInputElement): TextInputElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }
    }
  }

  data class OptionPickerElement(
    val unknownFields: ByteString = ByteString.EMPTY
  ) : Message<OptionPickerElement, OptionPickerElement.Builder>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Builder = Builder(this.copy())

    class Builder(
      private val message: OptionPickerElement
    ) : Message.Builder<OptionPickerElement, Builder>() {
      override fun build(): OptionPickerElement = message
    }

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<OptionPickerElement> = object : ProtoAdapter<OptionPickerElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        OptionPickerElement::class
      ) {
        override fun encodedSize(value: OptionPickerElement): Int = 
          value.unknownFields.size

        override fun encode(writer: ProtoWriter, value: OptionPickerElement) {
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): OptionPickerElement {
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              else -> TagHandler.UNKNOWN_TAG
            }
          }
          return OptionPickerElement(
            unknownFields = unknownFields
          )
        }

        override fun redact(value: OptionPickerElement): OptionPickerElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }
    }
  }

  data class DetailRowElement(
    val unknownFields: ByteString = ByteString.EMPTY
  ) : Message<DetailRowElement, DetailRowElement.Builder>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Builder = Builder(this.copy())

    class Builder(
      private val message: DetailRowElement
    ) : Message.Builder<DetailRowElement, Builder>() {
      override fun build(): DetailRowElement = message
    }

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<DetailRowElement> = object : ProtoAdapter<DetailRowElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        DetailRowElement::class
      ) {
        override fun encodedSize(value: DetailRowElement): Int = 
          value.unknownFields.size

        override fun encode(writer: ProtoWriter, value: DetailRowElement) {
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): DetailRowElement {
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              else -> TagHandler.UNKNOWN_TAG
            }
          }
          return DetailRowElement(
            unknownFields = unknownFields
          )
        }

        override fun redact(value: DetailRowElement): DetailRowElement = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }
    }
  }

  data class CurrencyConversionFlagsElement(
    val unknownFields: ByteString = ByteString.EMPTY
  ) : Message<CurrencyConversionFlagsElement, CurrencyConversionFlagsElement.Builder>(ADAPTER,
      unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Builder = Builder(this.copy())

    class Builder(
      private val message: CurrencyConversionFlagsElement
    ) : Message.Builder<CurrencyConversionFlagsElement, Builder>() {
      override fun build(): CurrencyConversionFlagsElement = message
    }

    companion object {
      @JvmField
      val ADAPTER: ProtoAdapter<CurrencyConversionFlagsElement> = object :
          ProtoAdapter<CurrencyConversionFlagsElement>(
        FieldEncoding.LENGTH_DELIMITED, 
        CurrencyConversionFlagsElement::class
      ) {
        override fun encodedSize(value: CurrencyConversionFlagsElement): Int = 
          value.unknownFields.size

        override fun encode(writer: ProtoWriter, value: CurrencyConversionFlagsElement) {
          writer.writeBytes(value.unknownFields)
        }

        override fun decode(reader: ProtoReader): CurrencyConversionFlagsElement {
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              else -> TagHandler.UNKNOWN_TAG
            }
          }
          return CurrencyConversionFlagsElement(
            unknownFields = unknownFields
          )
        }

        override fun redact(value: CurrencyConversionFlagsElement): CurrencyConversionFlagsElement =
            value.copy(
          unknownFields = ByteString.EMPTY
        )
      }
    }
  }
}
