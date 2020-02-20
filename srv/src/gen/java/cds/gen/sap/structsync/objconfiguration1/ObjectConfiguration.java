package cds.gen.sap.structsync.objconfiguration1;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;

@CdsName("sap.structsync.objconfiguration1.ObjectConfiguration")
public interface ObjectConfiguration extends CdsData {
  String KEY1 = "Key1";

  String OBJECT = "Object";

  String VALUE1 = "Value1";

  String SUB_OBJECT = "SubObject";

  String CONFIGURATION_FILE_LINK = "ConfigurationFileLink";

  @CdsName(KEY1)
  String getKey1();

  @CdsName(KEY1)
  void setKey1(String key1);

  @CdsName(OBJECT)
  String getObject();

  @CdsName(OBJECT)
  void setObject(String object);

  @CdsName(VALUE1)
  String getValue1();

  @CdsName(VALUE1)
  void setValue1(String value1);

  @CdsName(SUB_OBJECT)
  String getSubObject();

  @CdsName(SUB_OBJECT)
  void setSubObject(String subObject);

  @CdsName(CONFIGURATION_FILE_LINK)
  String getConfigurationFileLink();

  @CdsName(CONFIGURATION_FILE_LINK)
  void setConfigurationFileLink(String configurationFileLink);

  static ObjectConfiguration create() {
    return Struct.create(ObjectConfiguration.class);
  }
}
