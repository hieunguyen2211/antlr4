/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.test.runtime.swift;

import org.antlr.v4.test.runtime.BaseRuntimeTest;
import org.antlr.v4.test.runtime.RuntimeTestDescriptor;
import org.antlr.v4.test.runtime.category.ParserTestsGroup2;
import org.antlr.v4.test.runtime.descriptors.PerformanceDescriptors;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@Category(ParserTestsGroup2.class)
@RunWith(Parameterized.class)
public class TestPerformance extends BaseRuntimeTest {
	public TestPerformance(RuntimeTestDescriptor descriptor) {
		super(descriptor,new BaseSwiftTest());
	}

	@Parameterized.Parameters(name="{0}")
	public static RuntimeTestDescriptor[] getAllTestDescriptors() {
		return BaseRuntimeTest.getRuntimeTestDescriptors("Performance", "Swift");
	}
}

