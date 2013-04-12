package com.gizmo;

import org.json.JSONException;

public class GizmoExample {

    public static void main(String[] args) throws JSONException, GizmoAPIException, InterruptedException {

        // Create application and get key
        String key = GizmoAPI.createApplication().getString("key");
        long start = System.currentTimeMillis() * 1000; // microseconds timestamp

        // Start heartbeats for one app
        GizmoAPI.heartbeat(key, "deviceid1234");
        Thread.sleep(2000);
        GizmoAPI.heartbeat(key, "deviceid1234");
        Thread.sleep(2000);

        // Start heartbeats for second app
        GizmoAPI.heartbeat(key, "deviceid5678");
        Thread.sleep(2000);
        GizmoAPI.heartbeat(key, "deviceid5678");

        // Read live stats
        System.out.println(GizmoAPI.activeSessions(key));
        Thread.sleep(5000);

        long end = System.currentTimeMillis() * 1000; // microseconds timestamp

        // Read stats from given period
        System.out.println(GizmoAPI.activeSessions(key, start, end));
    }
}
