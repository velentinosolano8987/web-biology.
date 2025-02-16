/*
 * Copyright (c) 2012, 2024, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (c) 1991-2022 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in https://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that either
 * (a) this copyright and permission notice appear with all copies
 * of the Data Files or Software, or
 * (b) this copyright and permission notice appear in associated
 * Documentation.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.text.resources.cldr.ext;

import java.util.ListResourceBundle;

public class FormatData_zh_Hans_MO extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_TimePatterns = new String[] {
            "zzzz ah:mm:ss",
            "z ah:mm:ss",
            "ah:mm:ss",
            "ah:mm",
        };
        final String metaValue_generic_DateFormatItem_MMdd = "dd/MM";
        final String metaValue_generic_DateFormatItem_MMMMdd = "M\u6708d\u65e5";
        final String metaValue_generic_DateFormatItem_yMEd = "y\u5e74M\u6708d\u65e5\uff0cE";
        final String metaValue_generic_DateFormatItem_Md = "d/M";
        final String metaValue_generic_DateFormatItem_MEd = "E, d/M";
        final String metaValue_generic_DateFormatItem_yMd = "y\u5e74M\u6708d\u65e5";
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "Gy\u5e74M\u6708d\u65e5EEEE",
            "Gy\u5e74M\u6708d\u65e5",
            "Gy\u5e74M\u6708d\u65e5",
            "d/M/yyGGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "GGGGy\u5e74M\u6708d\u65e5EEEE",
            "GGGGy\u5e74M\u6708d\u65e5",
            "GGGGy\u5e74M\u6708d\u65e5",
            "d/M/yyG",
        };
        final String[] metaValue_java_time_roc_DatePatterns = new String[] {
            "",
            "",
            "",
            "Gd/M/yy",
        };
        final String[] metaValue_roc_DatePatterns = new String[] {
            "",
            "",
            "",
            "GGGGd/M/yy",
        };
        final Object[][] data = new Object[][] {
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "generic.DateFormatItem.MMMMdd", metaValue_generic_DateFormatItem_MMMMdd },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.DateFormatItem.yyyyMEd", "Gy\u5e74M\u6708d\u65e5\uff0cE" },
            { "generic.DateFormatItem.yyyyMd", "Gy\u5e74M\u6708d\u65e5" },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "DatePatterns",
                new String[] {
                    "y\u5e74M\u6708d\u65e5EEEE",
                    "y\u5e74M\u6708d\u65e5",
                    "y\u5e74M\u6708d\u65e5",
                    "d/M/yy",
                }
            },
            { "DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "DateFormatItem.MMMMdd", metaValue_generic_DateFormatItem_MMMMdd },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "buddhist.DateFormatItem.MMMMdd", metaValue_generic_DateFormatItem_MMMMdd },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "japanese.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "japanese.DateFormatItem.MMMMdd", metaValue_generic_DateFormatItem_MMMMdd },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_roc_DatePatterns },
            { "roc.DatePatterns", metaValue_roc_DatePatterns },
            { "roc.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "roc.DateFormatItem.MMMMdd", metaValue_generic_DateFormatItem_MMMMdd },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.MMM", "M\u6708" },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.islamic.DatePatterns", metaValue_java_time_roc_DatePatterns },
            { "islamic.DatePatterns", metaValue_roc_DatePatterns },
            { "islamic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic.DateFormatItem.MMMMdd", metaValue_generic_DateFormatItem_MMMMdd },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-civil.DateFormatItem.MMMMdd", metaValue_generic_DateFormatItem_MMMMdd },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-umalqura.DateFormatItem.MMMMdd", metaValue_generic_DateFormatItem_MMMMdd },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "latn.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "0",
                    "#",
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                    "",
                    "",
                }
            },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4#,##0.00",
                    "#,##0%",
                    "\u00a4#,##0.00;(\u00a4#,##0.00)",
                }
            },
        };
        return data;
    }
}
