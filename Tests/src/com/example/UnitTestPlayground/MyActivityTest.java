package com.example.UnitTestPlayground;

import android.test.ActivityInstrumentationTestCase2;
import junit.framework.Assert;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.example.UnitTestPlayground.MyActivityTest \
 * com.example.UnitTestPlayground.tests/android.test.InstrumentationTestRunner
 */
public class MyActivityTest extends ActivityInstrumentationTestCase2<MyActivity> {

	public void testStringForDisplay() throws Exception {
		int count = 1;
		MyActivity activity = getActivity();
		String result = activity.getStringForDisplay(count);
		Assert.assertEquals(result, "once");
	}

	public MyActivityTest() {
		super("com.example.UnitTestPlayground", MyActivity.class);
	}

}
