// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/image.proto

package com.google.cloud.automl.v1beta1;

public final class ImageProto {
  private ImageProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ImageClassificationDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ImageClassificationDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ImageClassificationModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ImageClassificationModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionModelDeploymentMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionModelDeploymentMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/cloud/automl/v1beta1/image.prot"
          + "o\022\033google.cloud.automl.v1beta1\0321google/c"
          + "loud/automl/v1beta1/annotation_spec.prot"
          + "o\0320google/cloud/automl/v1beta1/classific"
          + "ation.proto\032\037google/protobuf/timestamp.p"
          + "roto\032\034google/api/annotations.proto\"r\n\"Im"
          + "ageClassificationDatasetMetadata\022L\n\023clas"
          + "sification_type\030\001 \001(\0162/.google.cloud.aut"
          + "oml.v1beta1.ClassificationType\"%\n#ImageO"
          + "bjectDetectionDatasetMetadata\"\214\001\n ImageC"
          + "lassificationModelMetadata\022\025\n\rbase_model"
          + "_id\030\001 \001(\t\022\024\n\014train_budget\030\002 \001(\003\022\022\n\ntrain"
          + "_cost\030\003 \001(\003\022\023\n\013stop_reason\030\005 \001(\t\022\022\n\nmode"
          + "l_type\030\007 \001(\t\"\276\001\n!ImageObjectDetectionMod"
          + "elMetadata\022\022\n\nmodel_type\030\001 \001(\t\022\022\n\nnode_c"
          + "ount\030\003 \001(\003\022\020\n\010node_qps\030\004 \001(\001\022\023\n\013stop_rea"
          + "son\030\005 \001(\t\022%\n\035train_budget_milli_node_hou"
          + "rs\030\006 \001(\003\022#\n\033train_cost_milli_node_hours\030"
          + "\007 \001(\003\"A\n+ImageObjectDetectionModelDeploy"
          + "mentMetadata\022\022\n\nnode_count\030\001 \001(\003B\261\001\n\037com"
          + ".google.cloud.automl.v1beta1B\nImageProto"
          + "P\001ZAgoogle.golang.org/genproto/googleapi"
          + "s/cloud/automl/v1beta1;automl\312\002\033Google\\C"
          + "loud\\AutoMl\\V1beta1\352\002\036Google::Cloud::Aut"
          + "oML::V1beta1b\006proto3"
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
          com.google.cloud.automl.v1beta1.AnnotationSpecOuterClass.getDescriptor(),
          com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_automl_v1beta1_ImageClassificationDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_ImageClassificationDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ImageClassificationDatasetMetadata_descriptor,
            new java.lang.String[] {
              "ClassificationType",
            });
    internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionDatasetMetadata_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_automl_v1beta1_ImageClassificationModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1beta1_ImageClassificationModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ImageClassificationModelMetadata_descriptor,
            new java.lang.String[] {
              "BaseModelId", "TrainBudget", "TrainCost", "StopReason", "ModelType",
            });
    internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionModelMetadata_descriptor,
            new java.lang.String[] {
              "ModelType",
              "NodeCount",
              "NodeQps",
              "StopReason",
              "TrainBudgetMilliNodeHours",
              "TrainCostMilliNodeHours",
            });
    internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionModelDeploymentMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionModelDeploymentMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ImageObjectDetectionModelDeploymentMetadata_descriptor,
            new java.lang.String[] {
              "NodeCount",
            });
    com.google.cloud.automl.v1beta1.AnnotationSpecOuterClass.getDescriptor();
    com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
