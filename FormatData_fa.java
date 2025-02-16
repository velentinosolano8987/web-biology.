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

public class FormatData_fa extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_DayNames = new String[] {
            "\u06cc\u06a9\u0634\u0646\u0628\u0647",
            "\u062f\u0648\u0634\u0646\u0628\u0647",
            "\u0633\u0647\u200c\u0634\u0646\u0628\u0647",
            "\u0686\u0647\u0627\u0631\u0634\u0646\u0628\u0647",
            "\u067e\u0646\u062c\u0634\u0646\u0628\u0647",
            "\u062c\u0645\u0639\u0647",
            "\u0634\u0646\u0628\u0647",
        };
        final String metaValue_generic_DateFormatItem_yyyyMMMd = "d MMM y G";
        final String metaValue_generic_DateFormatItem_yyyyMd = "y/M/d GGGGG";
        final String metaValue_generic_DateFormatItem_yyyyMMMEd = "E d MMM y G";
        final String metaValue_generic_DateFormatItem_yQQQ = "QQQQ y";
        final String metaValue_generic_DateFormatItem_Gy = "y G";
        final String metaValue_generic_DateFormatItem_yyyyMMM = "MMM y G";
        final String[] metaValue_standalone_MonthNames = new String[] {
            "\u0698\u0627\u0646\u0648\u06cc\u0647",
            "\u0641\u0648\u0631\u06cc\u0647",
            "\u0645\u0627\u0631\u0633",
            "\u0622\u0648\u0631\u06cc\u0644",
            "\u0645\u0647",
            "\u0698\u0648\u0626\u0646",
            "\u0698\u0648\u0626\u06cc\u0647",
            "\u0627\u0648\u062a",
            "\u0633\u067e\u062a\u0627\u0645\u0628\u0631",
            "\u0627\u06a9\u062a\u0628\u0631",
            "\u0646\u0648\u0627\u0645\u0628\u0631",
            "\u062f\u0633\u0627\u0645\u0628\u0631",
            "",
        };
        final String[] metaValue_MonthNarrows = new String[] {
            "\u0698",
            "\u0641",
            "\u0645",
            "\u0622",
            "\u0645",
            "\u0698",
            "\u0698",
            "\u0627",
            "\u0633",
            "\u0627",
            "\u0646",
            "\u062f",
            "",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "\u06cc",
            "\u062f",
            "\u0633",
            "\u0686",
            "\u067e",
            "\u062c",
            "\u0634",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "\u0633\u0647\u200c\u0645\u0627\u0647\u0647\u0654 \u0627\u0648\u0644",
            "\u0633\u0647\u200c\u0645\u0627\u0647\u0647\u0654 \u062f\u0648\u0645",
            "\u0633\u0647\u200c\u0645\u0627\u0647\u0647\u0654 \u0633\u0648\u0645",
            "\u0633\u0647\u200c\u0645\u0627\u0647\u0647\u0654 \u0686\u0647\u0627\u0631\u0645",
        };
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "\u0633\u200c\u0645\u06f1",
            "\u0633\u200c\u0645\u06f2",
            "\u0633\u200c\u0645\u06f3",
            "\u0633\u200c\u0645\u06f4",
        };
        final String[] metaValue_QuarterNarrows = new String[] {
            "\u06f1",
            "\u06f2",
            "\u06f3",
            "\u06f4",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "\u0642\u0628\u0644\u200c\u0627\u0632\u0638\u0647\u0631",
            "\u0628\u0639\u062f\u0627\u0632\u0638\u0647\u0631",
            "",
            "",
            "\u0628\u0627\u0645\u062f\u0627\u062f",
            "\u0635\u0628\u062d",
            "\u0628\u0639\u062f\u0627\u0632\u0638\u0647\u0631",
            "\u0639\u0635\u0631",
            "",
            "",
            "\u0634\u0628",
            "\u0646\u06cc\u0645\u0647\u200c\u0634\u0628",
        };
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "\u0642",
            "\u0628",
            "",
            "",
            "\u0628",
            "\u0635",
            "\u0638",
            "\u0639",
            "",
            "",
            "\u0634",
            "\u0646",
        };
        final String[] metaValue_generic_abbreviated_AmPmMarkers = new String[] {
            "\u0642.\u0638.",
            "\u0628.\u0638.",
            "",
            "",
            "\u0628\u0627\u0645\u062f\u0627\u062f",
            "\u0635\u0628\u062d",
            "\u0638\u0647\u0631",
            "\u0639\u0635\u0631",
            "",
            "",
            "\u0634\u0628",
            "\u0646\u06cc\u0645\u0647\u200c\u0634\u0628",
        };
        final String[] metaValue_java_time_long_Eras = new String[] {
            "\u0642\u0628\u0644 \u0627\u0632 \u0645\u06cc\u0644\u0627\u062f",
            "\u0645\u06cc\u0644\u0627\u062f\u06cc",
        };
        final String[] metaValue_java_time_Eras = new String[] {
            "\u0642.\u0645.",
            "\u0645.",
        };
        final String[] metaValue_java_time_narrow_Eras = new String[] {
            "\u0642",
            "\u0645",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "H:mm:ss (zzzz)",
            "H:mm:ss (z)",
            "H:mm:ss",
            "H:mm",
        };
        final String[] metaValue_generic_DateTimePatterns = new String[] {
            "{1}\u060c \u0633\u0627\u0639\u062a {0}",
            "{1}\u060c \u0633\u0627\u0639\u062a {0}",
            "{1}\u060c\u200f {0}",
            "{1}\u060c\u200f {0}",
        };
        final String metaValue_generic_DateFormatItem_yMMMEd = "E d MMM y";
        final String metaValue_generic_DateFormatItem_yMEd = "E y/M/d";
        final String metaValue_generic_DateFormatItem_yMMMMEEEEd = "EEEE d MMMM y";
        final String metaValue_generic_DateFormatItem_yMMMd = "d MMM y";
        final String metaValue_generic_DateFormatItem_yw = "\u0647\u0641\u062a\u0647\u0654 w\u0645 Y";
        final String metaValue_generic_DateFormatItem_HHmmZ = "HH:mm (Z)";
        final String metaValue_generic_DateFormatItem_Hm = "H:mm";
        final String metaValue_generic_DateFormatItem_ms = "m:ss";
        final String metaValue_generic_DateFormatItem_EHms = "E H:mm:ss";
        final String metaValue_generic_DateFormatItem_EHm = "E H:mm";
        final String metaValue_generic_DateFormatItem_yMMM = "MMM y";
        final String metaValue_generic_DateFormatItem_mmss = "mm:ss";
        final String metaValue_generic_DateFormatItem_Md = "M/d";
        final String metaValue_generic_DateFormatItem_MMMMEd = "E d LLLL";
        final String metaValue_generic_DateFormatItem_Ed = "E d";
        final String metaValue_generic_DateFormatItem_MMMMd = "d LLLL";
        final String metaValue_generic_DateFormatItem_H = "H";
        final String metaValue_generic_DateFormatItem_MEd = "E M/d";
        final String metaValue_generic_DateFormatItem_MMMEd = "E d LLL";
        final String metaValue_generic_DateFormatItem_Hmsv = "H:mm:ss v";
        final String metaValue_generic_DateFormatItem_Hms = "H:mm:ss";
        final String metaValue_generic_DateFormatItem_Hmv = "H:mm v";
        final String metaValue_generic_DateFormatItem_yMd = "y/M/d";
        final String metaValue_generic_DateFormatItem_MMMd = "d LLL";
        final String metaValue_generic_DateFormatItem_yM = "y/M";
        final String metaValue_generic_DateFormatItem_yMMMM = "MMMM y";
        final String metaValue_generic_DateFormatItem_MMMMW = "\u0647\u0641\u062a\u0647\u0654 W\u0645 LLLL";
        final String[] metaValue_MonthNames = new String[] {
            "\u0698\u0627\u0646\u0648\u06cc\u0647\u0654",
            "\u0641\u0648\u0631\u06cc\u0647\u0654",
            "\u0645\u0627\u0631\u0633",
            "\u0622\u0648\u0631\u06cc\u0644",
            "\u0645\u0647\u0654",
            "\u0698\u0648\u0626\u0646",
            "\u0698\u0648\u0626\u06cc\u0647\u0654",
            "\u0627\u0648\u062a",
            "\u0633\u067e\u062a\u0627\u0645\u0628\u0631",
            "\u0627\u06a9\u062a\u0628\u0631",
            "\u0646\u0648\u0627\u0645\u0628\u0631",
            "\u062f\u0633\u0627\u0645\u0628\u0631",
            "",
        };
        final String[] metaValue_java_time_buddhist_long_Eras = new String[] {
            "BC",
            "\u062a\u0642\u0648\u06cc\u0645 \u0628\u0648\u062f\u0627\u06cc\u06cc",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE d MMMM y G",
            "d MMMM y G",
            "d MMM y G",
            "y/M/d GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE d MMMM y GGGG",
            "d MMMM y GGGG",
            "d MMM y GGGG",
            "y/M/d G",
        };
        final String[] metaValue_java_time_japanese_long_Eras = new String[] {
            "\u0645\u06cc\u0644\u0627\u062f\u06cc",
            "Meiji",
            "Taish\u014d",
            "Sh\u014dwa",
            "\u0647\u06cc\u0633\u06cc",
            "\u0631\u06cc\u0648\u0627",
        };
        final String[] metaValue_java_time_japanese_Eras = new String[] {
            "\u0645.",
            "Meiji",
            "Taish\u014d",
            "Sh\u014dwa",
            "\u0647\u06cc\u0633\u06cc",
            "\u0631\u06cc\u0648\u0627",
        };
        final String[] metaValue_java_time_japanese_narrow_Eras = new String[] {
            "\u0645",
            "M",
            "T",
            "S",
            "\u0647\u200d",
            "\u0631",
        };
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
            "\u0642\u0628\u0644 \u0627\u0632 R.O.C.",
            "\u062a\u0642\u0648\u06cc\u0645 \u0645\u06cc\u0646\u06af\u0648",
        };
        final String[] metaValue_islamic_MonthNames = new String[] {
            "\u0645\u062d\u0631\u0645",
            "\u0635\u0641\u0631",
            "\u0631\u0628\u06cc\u0639\u200c\u0627\u0644\u0627\u0648\u0644",
            "\u0631\u0628\u06cc\u0639\u200c\u0627\u0644\u062b\u0627\u0646\u06cc",
            "\u062c\u0645\u0627\u062f\u06cc\u200c\u0627\u0644\u0627\u0648\u0644",
            "\u062c\u0645\u0627\u062f\u06cc\u200c\u0627\u0644\u062b\u0627\u0646\u06cc",
            "\u0631\u062c\u0628",
            "\u0634\u0639\u0628\u0627\u0646",
            "\u0631\u0645\u0636\u0627\u0646",
            "\u0634\u0648\u0627\u0644",
            "\u0630\u06cc\u0642\u0639\u062f\u0647",
            "\u0630\u06cc\u062d\u062c\u0647",
            "",
        };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
            "",
            "\u0647\u062c\u0631\u06cc \u0642\u0645\u0631\u06cc",
        };
        final String[] metaValue_java_time_islamic_Eras = new String[] {
            "",
            "\u0647\u200d.\u0642.",
        };
        final String metaValue_calendarname_gregorian = "\u062a\u0642\u0648\u06cc\u0645 \u0645\u06cc\u0644\u0627\u062f\u06cc";
        final String[] metaValue_arab_NumberPatterns = new String[] {
            "#,##0.###",
            "\u200e\u00a4#,##0.00",
            "#,##0%",
            "",
        };
        final String[] metaValue_ListPatterns_standard = new String[] {
            "{0}\u060c\u200f {1}",
            "{0}\u060c\u200f {1}",
            "{0}\u060c \u0648 {1}",
            "{0} \u0648 {1}",
            "",
        };
        final String[] metaValue_ListPatterns_or = new String[] {
            "{0}\u060c\u200f {1}",
            "{0}\u060c\u200f {1}",
            "{0}\u060c \u06cc\u0627 {1}",
            "{0} \u06cc\u0627 {1}",
            "",
        };
        final Object[][] data = new Object[][] {
            { "generic.DayNames", metaValue_generic_DayNames },
            { "generic.DayAbbreviations", metaValue_generic_DayNames },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "generic.DateFormatItem.yyyyMMMM", "y MMMM G" },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "generic.DateFormatItem.yyyyQQQQ", "QQQQ y G" },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.yMMMMEEEEd", metaValue_generic_DateFormatItem_yMMMMEEEEd },
            { "generic.DateFormatItem.yyyyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yyyyMEd", "E y/M/d GGGGG" },
            { "generic.DateFormatItem.HHmmZ", metaValue_generic_DateFormatItem_HHmmZ },
            { "generic.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "generic.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "generic.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "generic.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "generic.DateFormatItem.yyyyMd", metaValue_generic_DateFormatItem_yyyyMd },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "generic.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.H", metaValue_generic_DateFormatItem_H },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.yyyyQQQ", "QQQ y G" },
            { "generic.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "generic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_yyyyMd },
            { "generic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "generic.DateFormatItem.yyyyM", "y/M GGGGG" },
            { "generic.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "generic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "generic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yyyy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.y", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "MonthNames", metaValue_MonthNames },
            { "standalone.MonthNames", metaValue_standalone_MonthNames },
            { "MonthAbbreviations", metaValue_standalone_MonthNames },
            { "standalone.MonthAbbreviations", metaValue_standalone_MonthNames },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "DayNames", metaValue_generic_DayNames },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "DayAbbreviations", metaValue_generic_DayNames },
            { "standalone.DayAbbreviations", metaValue_generic_DayNames },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "QuarterNarrows", metaValue_QuarterNarrows },
            { "standalone.QuarterNarrows", metaValue_QuarterNarrows },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.long.Eras", metaValue_java_time_long_Eras },
            { "long.Eras", metaValue_java_time_long_Eras },
            { "java.time.Eras", metaValue_java_time_Eras },
            { "Eras", metaValue_java_time_Eras },
            { "java.time.narrow.Eras", metaValue_java_time_narrow_Eras },
            { "narrow.Eras", metaValue_java_time_narrow_Eras },
            { "field.era", "\u062f\u0648\u0631\u0647" },
            { "field.year", "\u0633\u0627\u0644" },
            { "field.month", "\u0645\u0627\u0647" },
            { "field.week", "\u0647\u0641\u062a\u0647" },
            { "field.weekday", "\u0631\u0648\u0632 \u0647\u0641\u062a\u0647" },
            { "field.dayperiod", "\u0642.\u0638/\u0628.\u0638" },
            { "field.hour", "\u0633\u0627\u0639\u062a" },
            { "timezone.hourFormat", "\u200e+HH:mm;\u200e\u2212HH:mm" },
            { "timezone.gmtFormat", "{0} \u06af\u0631\u06cc\u0646\u0648\u06cc\u0686" },
            { "timezone.gmtZeroFormat", "\u06af\u0631\u06cc\u0646\u0648\u06cc\u0686" },
            { "timezone.regionFormat", "\u0648\u0642\u062a {0}" },
            { "timezone.regionFormat.daylight", "\u0648\u0642\u062a \u062a\u0627\u0628\u0633\u062a\u0627\u0646\u06cc {0}" },
            { "timezone.regionFormat.standard", "\u0648\u0642\u062a \u0639\u0627\u062f\u06cc {0}" },
            { "field.minute", "\u062f\u0642\u06cc\u0642\u0647" },
            { "field.second", "\u062b\u0627\u0646\u06cc\u0647" },
            { "field.zone", "\u0645\u0646\u0637\u0642\u0647\u0654 \u0632\u0645\u0627\u0646\u06cc" },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "DatePatterns",
                new String[] {
                    "EEEE d MMMM y",
                    "d MMMM y",
                    "d MMM y",
                    "y/M/d",
                }
            },
            { "DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "PluralRules", "one:i = 0 or n = 1" },
            { "DayPeriodRules", "night1:19:00-24:00;morning2:04:00-12:00;afternoon1:12:00-13:00;morning1:01:00-04:00;afternoon2:13:00-19:00;night2:00:00-01:00" },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "DateFormatItem.yMMMMEEEEd", metaValue_generic_DateFormatItem_yMMMMEEEEd },
            { "DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "DateFormatItem.HHmmZ", metaValue_generic_DateFormatItem_HHmmZ },
            { "DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "DateFormatItem.H", metaValue_generic_DateFormatItem_H },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "DateFormatItem.GyMd", metaValue_generic_DateFormatItem_yyyyMd },
            { "DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "buddhist.MonthAbbreviations", metaValue_standalone_MonthNames },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "buddhist.DayAbbreviations", metaValue_generic_DayNames },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "java.time.buddhist.Eras", metaValue_java_time_buddhist_long_Eras },
            { "buddhist.Eras", metaValue_java_time_buddhist_long_Eras },
            { "java.time.buddhist.narrow.Eras", metaValue_java_time_buddhist_long_Eras },
            { "buddhist.narrow.Eras", metaValue_java_time_buddhist_long_Eras },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "buddhist.DateFormatItem.yMMMMEEEEd", metaValue_generic_DateFormatItem_yMMMMEEEEd },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.DateFormatItem.HHmmZ", metaValue_generic_DateFormatItem_HHmmZ },
            { "buddhist.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "buddhist.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "buddhist.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "buddhist.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "buddhist.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.H", metaValue_generic_DateFormatItem_H },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "buddhist.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_yyyyMd },
            { "buddhist.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "buddhist.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "buddhist.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "japanese.MonthAbbreviations", metaValue_standalone_MonthNames },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayNames },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.QuarterNarrows", metaValue_QuarterNarrows },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "java.time.japanese.Eras", metaValue_java_time_japanese_Eras },
            { "japanese.Eras", metaValue_java_time_japanese_Eras },
            { "java.time.japanese.narrow.Eras", metaValue_java_time_japanese_narrow_Eras },
            { "japanese.narrow.Eras", metaValue_java_time_japanese_narrow_Eras },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "japanese.DateFormatItem.yMMMMEEEEd", metaValue_generic_DateFormatItem_yMMMMEEEEd },
            { "japanese.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.HHmmZ", metaValue_generic_DateFormatItem_HHmmZ },
            { "japanese.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "japanese.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "japanese.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "japanese.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "japanese.DateFormatItem.H", metaValue_generic_DateFormatItem_H },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "japanese.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_yyyyMd },
            { "japanese.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "japanese.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "japanese.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.MonthAbbreviations", metaValue_standalone_MonthNames },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "roc.QuarterNarrows", metaValue_QuarterNarrows },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "java.time.roc.Eras", metaValue_java_time_roc_long_Eras },
            { "roc.Eras", metaValue_java_time_roc_long_Eras },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "roc.DateFormatItem.yMMMMEEEEd", metaValue_generic_DateFormatItem_yMMMMEEEEd },
            { "roc.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.HHmmZ", metaValue_generic_DateFormatItem_HHmmZ },
            { "roc.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "roc.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "roc.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "roc.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "roc.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "roc.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "roc.DateFormatItem.H", metaValue_generic_DateFormatItem_H },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "roc.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_yyyyMd },
            { "roc.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "roc.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "roc.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic.MonthNames", metaValue_islamic_MonthNames },
            { "islamic.MonthAbbreviations", metaValue_islamic_MonthNames },
            { "islamic.MonthNarrows",
                new String[] {
                    "\u0645",
                    "\u0635",
                    "\u0631",
                    "\u0631",
                    "\u062c",
                    "\u062c",
                    "\u0631",
                    "\u0634",
                    "\u0631",
                    "\u0634",
                    "\u0630",
                    "\u0630",
                    "",
                }
            },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayNames },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_abbreviated_AmPmMarkers },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.Eras", metaValue_java_time_islamic_Eras },
            { "islamic.Eras", metaValue_java_time_islamic_Eras },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_Eras },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_Eras },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE d MMMM y G",
                    "d MMMM y G",
                    "d MMM y G",
                    "y/M/d G",
                }
            },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "d MMM y GGGG",
                    "y/M/d GGGG",
                }
            },
            { "islamic.DateTimePatterns",
                new String[] {
                    "{1}\u060c \u0633\u0627\u0639\u062a {0}",
                    "{1}\u060c \u0633\u0627\u0639\u062a {0}",
                    "",
                    "",
                }
            },
            { "islamic.DateFormatItem.yyyyMMMM", "MMMM y G" },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic.DateFormatItem.yMMMMEEEEd", metaValue_generic_DateFormatItem_yMMMMEEEEd },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic.DateFormatItem.HHmmZ", metaValue_generic_DateFormatItem_HHmmZ },
            { "islamic.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "islamic.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "islamic.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "islamic.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic.DateFormatItem.H", metaValue_generic_DateFormatItem_H },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.HmZ", metaValue_generic_DateFormatItem_HHmmZ },
            { "islamic.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "islamic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_yyyyMd },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "islamic.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-civil.DateFormatItem.yMMMMEEEEd", metaValue_generic_DateFormatItem_yMMMMEEEEd },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.HHmmZ", metaValue_generic_DateFormatItem_HHmmZ },
            { "islamic-civil.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "islamic-civil.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "islamic-civil.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "islamic-civil.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-civil.DateFormatItem.H", metaValue_generic_DateFormatItem_H },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "islamic-civil.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_yyyyMd },
            { "islamic-civil.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic-civil.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "islamic-civil.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-civil.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-umalqura.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-umalqura.DateFormatItem.yMMMMEEEEd", metaValue_generic_DateFormatItem_yMMMMEEEEd },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-umalqura.DateFormatItem.HHmmZ", metaValue_generic_DateFormatItem_HHmmZ },
            { "islamic-umalqura.DateFormatItem.Hm", metaValue_generic_DateFormatItem_Hm },
            { "islamic-umalqura.DateFormatItem.ms", metaValue_generic_DateFormatItem_ms },
            { "islamic-umalqura.DateFormatItem.EHms", metaValue_generic_DateFormatItem_EHms },
            { "islamic-umalqura.DateFormatItem.EHm", metaValue_generic_DateFormatItem_EHm },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-umalqura.DateFormatItem.mmss", metaValue_generic_DateFormatItem_mmss },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-umalqura.DateFormatItem.H", metaValue_generic_DateFormatItem_H },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.Hmsv", metaValue_generic_DateFormatItem_Hmsv },
            { "islamic-umalqura.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_yyyyMd },
            { "islamic-umalqura.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic-umalqura.DateFormatItem.Hms", metaValue_generic_DateFormatItem_Hms },
            { "islamic-umalqura.DateFormatItem.Hmv", metaValue_generic_DateFormatItem_Hmv },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-umalqura.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-umalqura.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "calendarname.islamic-civil", "\u062a\u0642\u0648\u06cc\u0645 \u0647\u062c\u0631\u06cc \u0642\u0645\u0631\u06cc \u062c\u062f\u0648\u0644\u06cc \u0645\u062f\u0646\u06cc" },
            { "calendarname.islamic", "\u062a\u0642\u0648\u06cc\u0645 \u0647\u062c\u0631\u06cc \u0642\u0645\u0631\u06cc" },
            { "calendarname.buddhist", "\u062a\u0642\u0648\u06cc\u0645 \u0628\u0648\u062f\u0627\u06cc\u06cc" },
            { "calendarname.japanese", "\u062a\u0642\u0648\u06cc\u0645 \u0698\u0627\u067e\u0646\u06cc" },
            { "calendarname.roc", "\u062a\u0642\u0648\u06cc\u0645 \u062c\u0645\u0647\u0648\u0631\u06cc \u0686\u06cc\u0646 (\u062a\u0627\u06cc\u0648\u0627\u0646)" },
            { "calendarname.islamic-umalqura", "\u062a\u0642\u0648\u06cc\u0645 \u0647\u062c\u0631\u06cc \u0642\u0645\u0631\u06cc \u0627\u0645\u200c\u0627\u0644\u0642\u0631\u06cc" },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "DefaultNumberingSystem", "arabext" },
            { "arab.NumberElements",
                new String[] {
                    "\u066b",
                    "\u066c",
                    "\u061b",
                    "\u066a",
                    "\u0660",
                    "#",
                    "\u061c-",
                    "\u0627\u0633",
                    "\u0609",
                    "\u221e",
                    "NaN",
                    "",
                    "",
                }
            },
            { "arab.NumberPatterns", metaValue_arab_NumberPatterns },
            { "arabext.NumberElements",
                new String[] {
                    "\u066b",
                    "\u066c",
                    "\u061b",
                    "\u066a",
                    "\u06f0",
                    "#",
                    "\u200e\u2212",
                    "\u00d7\u06f1\u06f0^",
                    "\u0609",
                    "\u221e",
                    "\u0646\u0627\u0639\u062f\u062f",
                    "",
                    "",
                }
            },
            { "arabext.NumberPatterns", metaValue_arab_NumberPatterns },
            { "latn.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "0",
                    "#",
                    "\u200e\u2212",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u0646\u0627\u0639\u062f\u062f",
                    "",
                    "",
                }
            },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u200e\u00a4\u00a0#,##0.00",
                    "#,##0%",
                    "\u200e\u00a4\u00a0#,##0.00;\u200e(\u00a4\u00a0#,##0.00)",
                }
            },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0\u00a0\u0647\u0632\u0627\u0631 other:0\u00a0\u0647\u0632\u0627\u0631}",
                    "{one:00\u00a0\u0647\u0632\u0627\u0631 other:00\u00a0\u0647\u0632\u0627\u0631}",
                    "{one:000\u00a0\u0647\u0632\u0627\u0631 other:000\u00a0\u0647\u0632\u0627\u0631}",
                    "{one:0\u00a0\u0645\u06cc\u0644\u06cc\u0648\u0646 other:0\u00a0\u0645\u06cc\u0644\u06cc\u0648\u0646}",
                    "{one:00\u00a0\u0645\u06cc\u0644\u06cc\u0648\u0646 other:00\u00a0\u0645\u06cc\u0644\u06cc\u0648\u0646}",
                    "{one:000\u00a0\u0645\u06cc\u0644\u06cc\u0648\u0646 other:000\u00a0\u0645\u06cc\u0644\u06cc\u0648\u0646}",
                    "{one:0\u00a0\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f other:0\u00a0\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f}",
                    "{one:00\u00a0\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f other:00\u00a0\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f}",
                    "{one:000\u00a0\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f other:000\u00a0\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f}",
                    "{one:0\u00a0\u062a\u0631\u06cc\u0644\u06cc\u0648\u0646 other:0\u00a0\u062a\u0631\u06cc\u0644\u06cc\u0648\u0646}",
                    "{one:00\u00a0\u062a\u0631\u06cc\u0644\u06cc\u0648\u0646 other:00\u00a0\u062a\u0631\u06cc\u0644\u06cc\u0648\u0646}",
                    "{one:000\u00a0\u062a\u0631\u06cc\u0644\u06cc\u0648\u0646 other:000\u00a0\u062a\u0631\u06cc\u0644\u06cc\u0648\u0646}",
                }
            },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' '\u0647\u0632\u0627\u0631 other:0' '\u0647\u0632\u0627\u0631}",
                    "{one:00' '\u0647\u0632\u0627\u0631 other:00' '\u0647\u0632\u0627\u0631}",
                    "{one:000' '\u0647\u0632\u0627\u0631 other:000' '\u0647\u0632\u0627\u0631}",
                    "{one:0' '\u0645\u06cc\u0644\u06cc\u0648\u0646 other:0' '\u0645\u06cc\u0644\u06cc\u0648\u0646}",
                    "{one:00' '\u0645\u06cc\u0644\u06cc\u0648\u0646 other:00' '\u0645\u06cc\u0644\u06cc\u0648\u0646}",
                    "{one:000' '\u0645\u06cc\u0644\u06cc\u0648\u0646 other:000' '\u0645\u06cc\u0644\u06cc\u0648\u0646}",
                    "{one:0' '\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f other:0' '\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f}",
                    "{one:00' '\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f other:00' '\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f}",
                    "{one:000' '\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f other:000' '\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f}",
                    "{one:0' '\u0647\u0632\u0627\u0631\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f other:0' '\u0647\u0632\u0627\u0631\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f}",
                    "{one:00' '\u0647\u0632\u0627\u0631\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f other:00' '\u0647\u0632\u0627\u0631\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f}",
                    "{one:000' '\u0647\u0632\u0627\u0631\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f other:000' '\u0647\u0632\u0627\u0631\u0645\u06cc\u0644\u06cc\u0627\u0631\u062f}",
                }
            },
            { "ListPatterns_standard", metaValue_ListPatterns_standard },
            { "ListPatterns_standard-short", metaValue_ListPatterns_standard },
            { "ListPatterns_standard-narrow",
                new String[] {
                    "{0}\u060c\u200f {1}",
                    "{0}\u060c\u200f {1}",
                    "{0}\u060c\u200f {1}",
                    "{0}\u060c\u200f {1}",
                    "",
                }
            },
            { "ListPatterns_or", metaValue_ListPatterns_or },
            { "ListPatterns_or-short", metaValue_ListPatterns_or },
            { "ListPatterns_or-narrow", metaValue_ListPatterns_or },
            { "ListPatterns_unit", metaValue_ListPatterns_standard },
            { "ListPatterns_unit-short",
                new String[] {
                    "{0}\u060c\u200f {1}",
                    "{0}\u060c\u200f {1}",
                    "{0}\u060c \u0648 {1}",
                    "{0}\u060c\u200f {1}",
                    "",
                }
            },
            { "ListPatterns_unit-narrow",
                new String[] {
                    "{0} {1}",
                    "{0} {1}",
                    "{0} {1}",
                    "{0} {1}",
                    "",
                }
            },
        };
        return data;
    }
}
