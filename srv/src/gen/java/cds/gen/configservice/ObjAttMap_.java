package cds.gen.configservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("ConfigService.ObjAttMap")
public interface ObjAttMap_ extends StructuredType<ObjAttMap_> {
  String CDS_NAME = "ConfigService.ObjAttMap";

  ElementRef<String> TargetSubObject();

  ElementRef<String> SourceObject();

  ElementRef<String> SourceAttribute();

  ElementRef<String> SourceSubObject();

  ElementRef<String> TargetSystem();

  ElementRef<String> SourceSystem();

  ElementRef<String> TargetAttribute();

  ElementRef<String> TargetObject();
}
