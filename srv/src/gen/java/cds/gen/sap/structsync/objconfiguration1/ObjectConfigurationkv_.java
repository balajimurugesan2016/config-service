package cds.gen.sap.structsync.objconfiguration1;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("sap.structsync.objconfiguration1.ObjectConfigurationkv")
public interface ObjectConfigurationkv_ extends StructuredType<ObjectConfigurationkv_> {
  String CDS_NAME = "sap.structsync.objconfiguration1.ObjectConfigurationkv";

  ElementRef<String> Key1();

  ElementRef<String> Object();

  ElementRef<String> Value1();

  ElementRef<String> SubObject();

  ElementRef<String> ConfigurationFileLink();
}
