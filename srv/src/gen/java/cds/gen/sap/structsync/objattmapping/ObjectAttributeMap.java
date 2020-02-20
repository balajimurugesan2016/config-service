package cds.gen.sap.structsync.objattmapping;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;

@CdsName("sap.structsync.objAttMapping.ObjectAttributeMap")
public interface ObjectAttributeMap extends CdsData {
  String TARGET_SUB_OBJECT = "TargetSubObject";

  String SOURCE_OBJECT = "SourceObject";

  String SOURCE_ATTRIBUTE = "SourceAttribute";

  String SOURCE_SUB_OBJECT = "SourceSubObject";

  String TARGET_SYSTEM = "TargetSystem";

  String SOURCE_SYSTEM = "SourceSystem";

  String TARGET_ATTRIBUTE = "TargetAttribute";

  String TARGET_OBJECT = "TargetObject";

  @CdsName(TARGET_SUB_OBJECT)
  String getTargetSubObject();

  @CdsName(TARGET_SUB_OBJECT)
  void setTargetSubObject(String targetSubObject);

  @CdsName(SOURCE_OBJECT)
  String getSourceObject();

  @CdsName(SOURCE_OBJECT)
  void setSourceObject(String sourceObject);

  @CdsName(SOURCE_ATTRIBUTE)
  String getSourceAttribute();

  @CdsName(SOURCE_ATTRIBUTE)
  void setSourceAttribute(String sourceAttribute);

  @CdsName(SOURCE_SUB_OBJECT)
  String getSourceSubObject();

  @CdsName(SOURCE_SUB_OBJECT)
  void setSourceSubObject(String sourceSubObject);

  @CdsName(TARGET_SYSTEM)
  String getTargetSystem();

  @CdsName(TARGET_SYSTEM)
  void setTargetSystem(String targetSystem);

  @CdsName(SOURCE_SYSTEM)
  String getSourceSystem();

  @CdsName(SOURCE_SYSTEM)
  void setSourceSystem(String sourceSystem);

  @CdsName(TARGET_ATTRIBUTE)
  String getTargetAttribute();

  @CdsName(TARGET_ATTRIBUTE)
  void setTargetAttribute(String targetAttribute);

  @CdsName(TARGET_OBJECT)
  String getTargetObject();

  @CdsName(TARGET_OBJECT)
  void setTargetObject(String targetObject);

  static ObjectAttributeMap create() {
    return Struct.create(ObjectAttributeMap.class);
  }
}
