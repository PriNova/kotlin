/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jps.build;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("jps-plugin/testData/incremental/lookupTracker/js")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JsLookupTrackerTestGenerated extends AbstractJsLookupTrackerTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInJs() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("jps-plugin/testData/incremental/lookupTracker/js"), Pattern.compile("^([^\\.]+)$"), null, false);
    }

    @TestMetadata("classifierMembers")
    public void testClassifierMembers() throws Exception {
        runTest("jps-plugin/testData/incremental/lookupTracker/js/classifierMembers/");
    }

    @TestMetadata("conventions")
    public void testConventions() throws Exception {
        runTest("jps-plugin/testData/incremental/lookupTracker/js/conventions/");
    }

    @TestMetadata("expressionType")
    public void testExpressionType() throws Exception {
        runTest("jps-plugin/testData/incremental/lookupTracker/js/expressionType/");
    }

    @TestMetadata("localDeclarations")
    public void testLocalDeclarations() throws Exception {
        runTest("jps-plugin/testData/incremental/lookupTracker/js/localDeclarations/");
    }

    @TestMetadata("packageDeclarations")
    public void testPackageDeclarations() throws Exception {
        runTest("jps-plugin/testData/incremental/lookupTracker/js/packageDeclarations/");
    }

    @TestMetadata("simple")
    public void testSimple() throws Exception {
        runTest("jps-plugin/testData/incremental/lookupTracker/js/simple/");
    }
}
