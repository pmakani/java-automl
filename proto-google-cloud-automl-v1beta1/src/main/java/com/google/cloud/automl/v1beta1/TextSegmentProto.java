// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/text_segment.proto

package com.google.cloud.automl.v1beta1;

public final class TextSegmentProto {
  private TextSegmentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TextSegment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextSegment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/automl/v1beta1/text_segme"
          + "nt.proto\022\033google.cloud.automl.v1beta1\032\034g"
          + "oogle/api/annotations.proto\"H\n\013TextSegme"
          + "nt\022\017\n\007content\030\003 \001(\t\022\024\n\014start_offset\030\001 \001("
          + "\003\022\022\n\nend_offset\030\002 \001(\003B\267\001\n\037com.google.clo"
          + "ud.automl.v1beta1B\020TextSegmentProtoP\001ZAg"
          + "oogle.golang.org/genproto/googleapis/clo"
          + "ud/automl/v1beta1;automl\312\002\033Google\\Cloud\\"
          + "AutoMl\\V1beta1\352\002\036Google::Cloud::AutoML::"
          + "V1beta1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_automl_v1beta1_TextSegment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_TextSegment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TextSegment_descriptor,
            new java.lang.String[] {
              "Content", "StartOffset", "EndOffset",
            });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
