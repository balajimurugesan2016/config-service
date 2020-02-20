package cds.gen.sap.structsync.objattmapping;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("sap.structsync.objAttMapping.ObjectAttributeMap")
public interface ObjectAttributeMap_ extends StructuredType<ObjectAttributeMap_> {
  String CDS_NAME = "sap.structsync.objAttMapping.ObjectAttributeMap";

  ElementRef<String> TargetSubObject();

  ElementRef<String> SourceObject();

  ElementRef<String> SourceAttribute();

  ElementRef<String> SourceSubObject();

  ElementRef<String> TargetSystem();

  ElementRef<String> SourceSystem();

  ElementRef<String> TargetAttribute();

  ElementRef<String> TargetObject();
}
