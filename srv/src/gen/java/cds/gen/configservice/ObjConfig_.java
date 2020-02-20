package cds.gen.configservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("ConfigService.ObjConfig")
public interface ObjConfig_ extends StructuredType<ObjConfig_> {
  String CDS_NAME = "ConfigService.ObjConfig";

  ElementRef<String> PrimaryIdentifier();

  ElementRef<String> ParentTertiaryyKey();

  ElementRef<String> SecondaryIdentifier();

  ElementRef<String> ConfigurationFileLink();

  ElementRef<String> Key2();

  ElementRef<String> Key1();

  ElementRef<String> ChildSecondrykey();

  ElementRef<String> Key4();

  ElementRef<String> Key3();

  ElementRef<String> ChildPrimarykey();

  ElementRef<String> Object();

  ElementRef<String> ChildTertiarykey();

  ElementRef<String> SubObject();

  ElementRef<String> ParentPrimaryKey();

  ElementRef<String> ParentSecondryKey();
}
