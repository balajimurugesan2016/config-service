package cds.gen.sap.structsync.objconfiguration;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;

@CdsName("sap.structsync.objconfiguration.ObjectConfiguration")
public interface ObjectConfiguration extends CdsData {
  String PRIMARY_IDENTIFIER = "PrimaryIdentifier";

  String PARENT_TERTIARYY_KEY = "ParentTertiaryyKey";

  String SECONDARY_IDENTIFIER = "SecondaryIdentifier";

  String CONFIGURATION_FILE_LINK = "ConfigurationFileLink";

  String KEY2 = "Key2";

  String KEY1 = "Key1";

  String CHILD_SECONDRYKEY = "ChildSecondrykey";

  String KEY4 = "Key4";

  String KEY3 = "Key3";

  String CHILD_PRIMARYKEY = "ChildPrimarykey";

  String OBJECT = "Object";

  String CHILD_TERTIARYKEY = "ChildTertiarykey";

  String SUB_OBJECT = "SubObject";

  String PARENT_PRIMARY_KEY = "ParentPrimaryKey";

  String PARENT_SECONDRY_KEY = "ParentSecondryKey";

  @CdsName(PRIMARY_IDENTIFIER)
  String getPrimaryIdentifier();

  @CdsName(PRIMARY_IDENTIFIER)
  void setPrimaryIdentifier(String primaryIdentifier);

  @CdsName(PARENT_TERTIARYY_KEY)
  String getParentTertiaryyKey();

  @CdsName(PARENT_TERTIARYY_KEY)
  void setParentTertiaryyKey(String parentTertiaryyKey);

  @CdsName(SECONDARY_IDENTIFIER)
  String getSecondaryIdentifier();

  @CdsName(SECONDARY_IDENTIFIER)
  void setSecondaryIdentifier(String secondaryIdentifier);

  @CdsName(CONFIGURATION_FILE_LINK)
  String getConfigurationFileLink();

  @CdsName(CONFIGURATION_FILE_LINK)
  void setConfigurationFileLink(String configurationFileLink);

  @CdsName(KEY2)
  String getKey2();

  @CdsName(KEY2)
  void setKey2(String key2);

  @CdsName(KEY1)
  String getKey1();

  @CdsName(KEY1)
  void setKey1(String key1);

  @CdsName(CHILD_SECONDRYKEY)
  String getChildSecondrykey();

  @CdsName(CHILD_SECONDRYKEY)
  void setChildSecondrykey(String childSecondrykey);

  @CdsName(KEY4)
  String getKey4();

  @CdsName(KEY4)
  void setKey4(String key4);

  @CdsName(KEY3)
  String getKey3();

  @CdsName(KEY3)
  void setKey3(String key3);

  @CdsName(CHILD_PRIMARYKEY)
  String getChildPrimarykey();

  @CdsName(CHILD_PRIMARYKEY)
  void setChildPrimarykey(String childPrimarykey);

  @CdsName(OBJECT)
  String getObject();

  @CdsName(OBJECT)
  void setObject(String object);

  @CdsName(CHILD_TERTIARYKEY)
  String getChildTertiarykey();

  @CdsName(CHILD_TERTIARYKEY)
  void setChildTertiarykey(String childTertiarykey);

  @CdsName(SUB_OBJECT)
  String getSubObject();

  @CdsName(SUB_OBJECT)
  void setSubObject(String subObject);

  @CdsName(PARENT_PRIMARY_KEY)
  String getParentPrimaryKey();

  @CdsName(PARENT_PRIMARY_KEY)
  void setParentPrimaryKey(String parentPrimaryKey);

  @CdsName(PARENT_SECONDRY_KEY)
  String getParentSecondryKey();

  @CdsName(PARENT_SECONDRY_KEY)
  void setParentSecondryKey(String parentSecondryKey);

  static ObjectConfiguration create() {
    return Struct.create(ObjectConfiguration.class);
  }
}
