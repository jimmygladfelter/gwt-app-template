package com.app.gwt.client.lib.js;

import com.google.gwt.core.client.JavaScriptObject;

public class BaseJso extends JavaScriptObject {

	public static BaseJso createObject() {
		return JavaScriptObject.createObject().cast();
	}

	public final native Object getObjectProperty(String propertyName) /*-{
		var obj = null;
		if (propertyName != null) {
			obj = this[propertyName];
		}
		return obj;
	}-*/;

	public final native void setObjectProperty(String propertyName, Object object) /*-{
		if (propertyName != null) {
			this[propertyName] = object;
		} else {
			delete this[propertyName];
		}
	}-*/;

}
