
CREATE TABLE sap_structsync_objAttMapping_ObjectAttributeMap (
  SourceSystem NVARCHAR(5) NOT NULL,
  SourceObject NVARCHAR(30) NOT NULL,
  SourceSubObject NVARCHAR(30) NOT NULL,
  TargetSystem NVARCHAR(5) NOT NULL,
  TargetObject NVARCHAR(30) NOT NULL,
  TargetSubObject NVARCHAR(30) NOT NULL,
  SourceAttribute NVARCHAR(100),
  TargetAttribute NVARCHAR(100),
  PRIMARY KEY(SourceSystem, SourceObject, SourceSubObject, TargetSystem, TargetObject, TargetSubObject)
);

CREATE TABLE sap_structsync_objconfiguration_ObjectConfiguration (
  Object NVARCHAR(100) NOT NULL,
  SubObject NVARCHAR(100) NOT NULL,
  PrimaryIdentifier NVARCHAR(100) NOT NULL,
  SecondaryIdentifier NVARCHAR(100) NOT NULL,
  ParentPrimaryKey NVARCHAR(100) NOT NULL,
  ChildPrimarykey NVARCHAR(100) NOT NULL,
  ParentSecondryKey NVARCHAR(100) NOT NULL,
  ChildSecondrykey NVARCHAR(100) NOT NULL,
  ParentTertiaryyKey NVARCHAR(100) NOT NULL,
  ChildTertiarykey NVARCHAR(100) NOT NULL,
  Key1 NVARCHAR(100),
  Key2 NVARCHAR(100),
  Key3 NVARCHAR(100),
  Key4 NVARCHAR(100),
  ConfigurationFileLink NCLOB,
  PRIMARY KEY(Object, SubObject, PrimaryIdentifier, SecondaryIdentifier, ParentPrimaryKey, ChildPrimarykey, ParentSecondryKey, ChildSecondrykey, ParentTertiaryyKey, ChildTertiarykey)
);

CREATE TABLE sap_structsync_objconfiguration1_ObjectConfiguration (
  Object NVARCHAR(100) NOT NULL,
  SubObject NVARCHAR(100) NOT NULL,
  Key1 NVARCHAR(100),
  Value1 NVARCHAR(100),
  ConfigurationFileLink NCLOB,
  PRIMARY KEY(Object, SubObject)
);

CREATE VIEW ConfigService_ObjAttMap AS SELECT
  ObjectAttributeMap_0.SourceSystem,
  ObjectAttributeMap_0.SourceObject,
  ObjectAttributeMap_0.SourceSubObject,
  ObjectAttributeMap_0.TargetSystem,
  ObjectAttributeMap_0.TargetObject,
  ObjectAttributeMap_0.TargetSubObject,
  ObjectAttributeMap_0.SourceAttribute,
  ObjectAttributeMap_0.TargetAttribute
FROM sap_structsync_objAttMapping_ObjectAttributeMap AS ObjectAttributeMap_0;

CREATE VIEW ConfigService_ObjConfig AS SELECT
  ObjectConfiguration_0.Object,
  ObjectConfiguration_0.SubObject,
  ObjectConfiguration_0.PrimaryIdentifier,
  ObjectConfiguration_0.SecondaryIdentifier,
  ObjectConfiguration_0.ParentPrimaryKey,
  ObjectConfiguration_0.ChildPrimarykey,
  ObjectConfiguration_0.ParentSecondryKey,
  ObjectConfiguration_0.ChildSecondrykey,
  ObjectConfiguration_0.ParentTertiaryyKey,
  ObjectConfiguration_0.ChildTertiarykey,
  ObjectConfiguration_0.Key1,
  ObjectConfiguration_0.Key2,
  ObjectConfiguration_0.Key3,
  ObjectConfiguration_0.Key4,
  ObjectConfiguration_0.ConfigurationFileLink
FROM sap_structsync_objconfiguration_ObjectConfiguration AS ObjectConfiguration_0;

CREATE VIEW ConfigService_ObjConfigkeyValue AS SELECT
  ObjectConfiguration_0.Object,
  ObjectConfiguration_0.SubObject,
  ObjectConfiguration_0.Key1,
  ObjectConfiguration_0.Value1,
  ObjectConfiguration_0.ConfigurationFileLink
FROM sap_structsync_objconfiguration1_ObjectConfiguration AS ObjectConfiguration_0;

