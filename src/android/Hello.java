package org.apache.cordova.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Hello extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("show")) {

            String name = data.getString(0);
            String message = "Testing..Hello, " + name;
            ArrayList<PInfo> apps = getInstalledApps(false); /* false = no system packages */
            callbackContext.success(apps);

            return true;

        } else {
            
            return false;

        }
    }
    
//    public static void trimCache(Context context) {
//        File dir = context.getCacheDir();
//        if(dir!= null && dir.isDirectory()){
//            File[] children = dir.listFiles();
//            if (children == null) {
//                // Either dir does not exist or is not a directory
//            } else {
//                File temp;
//                for (int i = 0; i < children.length; i++) {
//                    temp = children[i];
//                    temp.delete();
//                }
//            }
//        }
//    } 
    
 class PInfo {
    private String appname = "";
    private String pname = "";
    private String versionName = "";
    private int versionCode = 0;
    private Drawable icon;
}

//private ArrayList<PInfo> getPackages() {
//    ArrayList<PInfo> apps = getInstalledApps(false); /* false = no system packages */
//    return apps;
//}

private ArrayList<PInfo> getInstalledApps(boolean getSysPackages) {
    ArrayList<PInfo> res = new ArrayList<PInfo>();        
    List<PackageInfo> packs = getPackageManager().getInstalledPackages(0);
    for(int i=0;i<packs.size();i++) {
        PackageInfo p = packs.get(i);
        if ((!getSysPackages) && (p.versionName == null)) {
            continue ;
        }
        PInfo newInfo = new PInfo();
        newInfo.appname = p.applicationInfo.loadLabel(getPackageManager()).toString();
        newInfo.pname = p.packageName;
        newInfo.versionName = p.versionName;
        newInfo.versionCode = p.versionCode;
        newInfo.icon = p.applicationInfo.loadIcon(getPackageManager());
        res.add(newInfo);
    }
    return res; 
}
    
}
