// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/translation.proto

package com.google.cloud.automl.v1beta1;

public final class TranslationProto {
  private TranslationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_TranslationDatasetMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TranslationDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_TranslationEvaluationMetrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TranslationEvaluationMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_TranslationModelMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TranslationModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_automl_v1beta1_TranslationAnnotation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TranslationAnnotation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/automl/v1beta1/translatio" +
      "n.proto\022\033google.cloud.automl.v1beta1\032\034go" +
      "ogle/api/annotations.proto\032,google/cloud" +
      "/automl/v1beta1/data_items.proto\"X\n\032Tran" +
      "slationDatasetMetadata\022\034\n\024source_languag" +
      "e_code\030\001 \001(\t\022\034\n\024target_language_code\030\002 \001" +
      "(\t\"K\n\034TranslationEvaluationMetrics\022\022\n\nbl" +
      "eu_score\030\001 \001(\001\022\027\n\017base_bleu_score\030\002 \001(\001\"" +
      "j\n\030TranslationModelMetadata\022\022\n\nbase_mode" +
      "l\030\001 \001(\t\022\034\n\024source_language_code\030\002 \001(\t\022\034\n" +
      "\024target_language_code\030\003 \001(\t\"]\n\025Translati" +
      "onAnnotation\022D\n\022translated_content\030\001 \001(\013" +
      "2(.google.cloud.automl.v1beta1.TextSnipp" +
      "etBx\n\037com.google.cloud.automl.v1beta1B\020T" +
      "ranslationProtoP\001ZAgoogle.golang.org/gen" +
      "proto/googleapis/cloud/automl/v1beta1;au" +
      "tomlb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.DataItems.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_automl_v1beta1_TranslationDatasetMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_TranslationDatasetMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_TranslationDatasetMetadata_descriptor,
        new java.lang.String[] { "SourceLanguageCode", "TargetLanguageCode", });
    internal_static_google_cloud_automl_v1beta1_TranslationEvaluationMetrics_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1beta1_TranslationEvaluationMetrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_TranslationEvaluationMetrics_descriptor,
        new java.lang.String[] { "BleuScore", "BaseBleuScore", });
    internal_static_google_cloud_automl_v1beta1_TranslationModelMetadata_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1beta1_TranslationModelMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_TranslationModelMetadata_descriptor,
        new java.lang.String[] { "BaseModel", "SourceLanguageCode", "TargetLanguageCode", });
    internal_static_google_cloud_automl_v1beta1_TranslationAnnotation_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1beta1_TranslationAnnotation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_automl_v1beta1_TranslationAnnotation_descriptor,
        new java.lang.String[] { "TranslatedContent", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.automl.v1beta1.DataItems.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
