using sap.structsync.objAttMapping as ObjAttMapSp from '../db/objAttMapping';
using sap.structsync.objconfiguration as ObjConfigurationSp from '../db/objConfiguration';
using sap.structsync.objconfiguration1 as ObjConfiguration1Sp from '../db/objConfiguration1';
service ConfigService{
 entity ObjAttMap as  projection on ObjAttMapSp.ObjectAttributeMap;
  entity ObjConfig as  projection on ObjConfigurationSp.ObjectConfiguration;
  entity ObjConfigkeyValue as projection on ObjConfiguration1Sp.ObjectConfiguration;
}