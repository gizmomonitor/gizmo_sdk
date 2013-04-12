package com.gizmo;

@SuppressWarnings("serial")
public class GizmoAPIException extends Exception {

    public GizmoAPIException(Exception e) {
        super(e);
    }

    public GizmoAPIException(String msg) {
        super(msg);
    }
}