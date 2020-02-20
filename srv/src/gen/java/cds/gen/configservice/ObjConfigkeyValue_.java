package cds.gen.configservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("ConfigService.ObjConfigkeyValue")
public interface ObjConfigkeyValue_ extends StructuredType<ObjConfigkeyValue_> {
  String CDS_NAME = "ConfigService.ObjConfigkeyValue";

  ElementRef<String> Key1();

  ElementRef<String> Object();

  ElementRef<String> Value1();

  ElementRef<String> SubObject();

  ElementRef<String> ConfigurationFileLink();
}
