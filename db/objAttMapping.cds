namespace sap.structsync.objAttMapping;

@Capabilities.Updatable:true
@Capabilities.Deletable:true
define entity ObjectAttributeMap {
key SourceSystem:String(5);
key SourceObject:String(30);
key SourceSubObject:String(30);
key TargetSystem:String(5);
key TargetObject:String(30);
key TargetSubObject:String(30);
SourceAttribute:String(100);
TargetAttribute:String(100);
}