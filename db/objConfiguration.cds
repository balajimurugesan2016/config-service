namespace sap.structsync.objconfiguration;

@Capabilities.Updatable:true
@Capabilities.Deletable:true
entity ObjectConfiguration{
key Object:String(100);
key SubObject:String(100);
key PrimaryIdentifier:String(100);
key SecondaryIdentifier:String(100);
key ParentPrimaryKey:String(100);
key ChildPrimarykey:String(100);
key ParentSecondryKey:String(100);
key ChildSecondrykey:String(100);
key ParentTertiaryyKey:String(100);
key ChildTertiarykey:String(100);
Key1:String(100);
Key2:String(100);
Key3:String(100);
Key4:String(100);
ConfigurationFileLink:LargeString;
}