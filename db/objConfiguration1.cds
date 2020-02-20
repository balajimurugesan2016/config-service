namespace sap.structsync.objconfiguration1;

@Capabilities.Updatable:true
@Capabilities.Deletable:true
define  entity ObjectConfigurationkv{
key Object:String(100);
key SubObject:String(100);
Key1:String(100);
Value1:String(100);
ConfigurationFileLink:LargeString;
}