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

public class FormatData_es_PA extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "a.\u202fm.",
            "p.\u202fm.",
            "",
            "mediod\u00eda",
            "de la madrugada",
            "de la ma\u00f1ana",
            "",
            "",
            "de la tarde",
            "",
            "de la noche",
            "",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "1er. trimestre",
            "2do. trimestre",
            "3er. trimestre",
            "4.\u00ba trimestre",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "a.\u00a0m.",
            "p.\u00a0m.",
            "",
            "mediod\u00eda",
            "de la madrugada",
            "de la ma\u00f1ana",
            "",
            "",
            "de la tarde",
            "",
            "de la noche",
            "",
        };
        final String metaValue_generic_DateFormatItem_yMEd = "E MM/dd/y";
        final String metaValue_generic_DateFormatItem_Md = "MM/dd";
        final String metaValue_generic_DateFormatItem_MEd = "E, MM/dd";
        final String metaValue_generic_DateFormatItem_yMd = "MM/dd/y";
        final String metaValue_generic_DateFormatItem_yM = "MM/y";
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE, d 'de' MMMM 'de' y G",
            "d 'de' MMMM 'de' y G",
            "MM/dd/y G",
            "MM/dd/yy GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, d 'de' MMMM 'de' y GGGG",
            "d 'de' MMMM 'de' y GGGG",
            "MM/dd/y GGGG",
            "MM/dd/yy G",
        };
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
            "",
            "",
            "MM/dd/y G",
            "MM/dd/yy GGGGG",
        };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
            "",
            "",
            "MM/dd/y GGGG",
            "MM/dd/yy G",
        };
        final Object[][] data = new Object[][] {
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "QuarterAbbreviations", metaValue_generic_QuarterNames },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "DatePatterns",
                new String[] {
                    "EEEE, d 'de' MMMM 'de' y",
                    "d 'de' MMMM 'de' y",
                    "MM/dd/y",
                    "MM/dd/yy",
                }
            },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "java.time.islamic.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "islamic.DatePatterns", metaValue_buddhist_DatePatterns },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
        };
        return data;
    }
}
