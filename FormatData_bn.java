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

public class FormatData_bn extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "AM",
            "PM",
            "",
            "",
            "\u09ad\u09cb\u09b0",
            "\u09b8\u0995\u09be\u09b2",
            "\u09a6\u09c1\u09aa\u09c1\u09b0",
            "\u09ac\u09bf\u0995\u09be\u09b2",
            "\u09b8\u09a8\u09cd\u09a7\u09cd\u09af\u09be",
            "",
            "\u09b0\u09be\u09a4\u09cd\u09b0\u09bf",
            "",
        };
        final String metaValue_generic_DateFormatItem_yyyyMMMd = "d MMM, y G";
        final String metaValue_generic_DateFormatItem_yyyyMMMEd = "E, d MMM, y G";
        final String metaValue_generic_DateFormatItem_Gy = "y G";
        final String metaValue_generic_DateFormatItem_yyyyMMM = "MMM y G";
        final String[] metaValue_MonthNames = new String[] {
            "\u099c\u09be\u09a8\u09c1\u09af\u09bc\u09be\u09b0\u09c0",
            "\u09ab\u09c7\u09ac\u09cd\u09b0\u09c1\u09af\u09bc\u09be\u09b0\u09c0",
            "\u09ae\u09be\u09b0\u09cd\u099a",
            "\u098f\u09aa\u09cd\u09b0\u09bf\u09b2",
            "\u09ae\u09c7",
            "\u099c\u09c1\u09a8",
            "\u099c\u09c1\u09b2\u09be\u0987",
            "\u0986\u0997\u09b8\u09cd\u099f",
            "\u09b8\u09c7\u09aa\u09cd\u099f\u09c7\u09ae\u09cd\u09ac\u09b0",
            "\u0985\u0995\u09cd\u099f\u09cb\u09ac\u09b0",
            "\u09a8\u09ad\u09c7\u09ae\u09cd\u09ac\u09b0",
            "\u09a1\u09bf\u09b8\u09c7\u09ae\u09cd\u09ac\u09b0",
            "",
        };
        final String[] metaValue_MonthNarrows = new String[] {
            "\u099c\u09be",
            "\u09ab\u09c7",
            "\u09ae\u09be",
            "\u098f",
            "\u09ae\u09c7",
            "\u099c\u09c1\u09a8",
            "\u099c\u09c1",
            "\u0986",
            "\u09b8\u09c7",
            "\u0985",
            "\u09a8",
            "\u09a1\u09bf",
            "",
        };
        final String[] metaValue_generic_DayNames = new String[] {
            "\u09b0\u09ac\u09bf\u09ac\u09be\u09b0",
            "\u09b8\u09cb\u09ae\u09ac\u09be\u09b0",
            "\u09ae\u0999\u09cd\u0997\u09b2\u09ac\u09be\u09b0",
            "\u09ac\u09c1\u09a7\u09ac\u09be\u09b0",
            "\u09ac\u09c3\u09b9\u09b8\u09cd\u09aa\u09a4\u09bf\u09ac\u09be\u09b0",
            "\u09b6\u09c1\u0995\u09cd\u09b0\u09ac\u09be\u09b0",
            "\u09b6\u09a8\u09bf\u09ac\u09be\u09b0",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "\u09b0\u09ac\u09bf",
            "\u09b8\u09cb\u09ae",
            "\u09ae\u0999\u09cd\u0997\u09b2",
            "\u09ac\u09c1\u09a7",
            "\u09ac\u09c3\u09b9\u09b8\u09cd\u09aa\u09a4\u09bf",
            "\u09b6\u09c1\u0995\u09cd\u09b0",
            "\u09b6\u09a8\u09bf",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "\u09b0",
            "\u09b8\u09cb",
            "\u09ae",
            "\u09ac\u09c1",
            "\u09ac\u09c3",
            "\u09b6\u09c1",
            "\u09b6",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "\u09a4\u09cd\u09b0\u09c8\u09ae\u09be\u09b8\u09bf\u0995",
            "\u09a6\u09cd\u09ac\u09bf\u09a4\u09c0\u09af\u09bc \u09a4\u09cd\u09b0\u09c8\u09ae\u09be\u09b8\u09bf\u0995",
            "\u09a4\u09c3\u09a4\u09c0\u09af\u09bc \u09a4\u09cd\u09b0\u09c8\u09ae\u09be\u09b8\u09bf\u0995",
            "\u099a\u09a4\u09c1\u09b0\u09cd\u09a5 \u09a4\u09cd\u09b0\u09c8\u09ae\u09be\u09b8\u09bf\u0995",
        };
        final String[] metaValue_QuarterNarrows = new String[] {
            "\u09e7",
            "\u09e8",
            "\u09e9",
            "\u09ea",
        };
        final String[] metaValue_generic_AmPmMarkers = new String[] {
            "AM",
            "PM",
            "",
            "",
            "\u09ad\u09cb\u09b0\u09ac\u09c7\u09b2\u09be\u09af\u09bc",
            "\u09b8\u0995\u09be\u09b2\u09ac\u09c7\u09b2\u09be\u09af\u09bc",
            "\u09a6\u09c1\u09aa\u09c1\u09b0\u09ac\u09c7\u09b2\u09be\u09af\u09bc",
            "\u09ac\u09bf\u0995\u09be\u09b2",
            "\u09b8\u09a8\u09cd\u09a7\u09cd\u09af\u09be\u09ac\u09c7\u09b2\u09be\u09af\u09bc",
            "",
            "\u09b0\u09be\u09a4\u09cd\u09b0\u09bf\u09ac\u09c7\u09b2\u09be\u09af\u09bc",
            "",
        };
        final String[] metaValue_java_time_long_Eras = new String[] {
            "\u0996\u09cd\u09b0\u09bf\u09b8\u09cd\u099f\u09aa\u09c2\u09b0\u09cd\u09ac",
            "\u0996\u09cd\u09b0\u09c0\u09b7\u09cd\u099f\u09be\u09ac\u09cd\u09a6",
        };
        final String[] metaValue_java_time_Eras = new String[] {
            "\u0996\u09cd\u09b0\u09bf\u09b8\u09cd\u099f\u09aa\u09c2\u09b0\u09cd\u09ac",
            "\u0996\u09c3\u09b7\u09cd\u099f\u09be\u09ac\u09cd\u09a6",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "h:mm:ss a zzzz",
            "h:mm:ss a z",
            "h:mm:ss a",
            "h:mm a",
        };
        final String[] metaValue_generic_DateTimePatterns = new String[] {
            "{1} {0}",
            "{1} {0}",
            "{1} {0}",
            "{1} {0}",
        };
        final String metaValue_generic_DateFormatItem_MMdd = "dd-MM";
        final String metaValue_generic_DateFormatItem_yMMMEd = "E, d MMM, y";
        final String metaValue_generic_DateFormatItem_yMEd = "E, d/M/y";
        final String metaValue_generic_DateFormatItem_yMMMd = "d MMM, y";
        final String metaValue_generic_DateFormatItem_yw = "Y \u098f\u09b0 w\u09a4\u09ae \u09b8\u09aa\u09cd\u09a4\u09be\u09b9";
        final String metaValue_generic_DateFormatItem_yQQQ = "QQQ y";
        final String metaValue_generic_DateFormatItem_yMMM = "MMM y";
        final String metaValue_generic_DateFormatItem_Md = "d/M";
        final String metaValue_generic_DateFormatItem_MMMMEd = "E d MMMM";
        final String metaValue_generic_DateFormatItem_Ed = "d E";
        final String metaValue_generic_DateFormatItem_MMMMd = "d MMMM";
        final String metaValue_generic_DateFormatItem_MEd = "E, d-M";
        final String metaValue_generic_DateFormatItem_MMMEd = "E d MMM";
        final String metaValue_generic_DateFormatItem_yMM = "MM-y";
        final String metaValue_generic_DateFormatItem_GyMd = "dd-MM-y GGGGG";
        final String metaValue_generic_DateFormatItem_yMd = "d/M/y";
        final String metaValue_generic_DateFormatItem_MMMd = "d MMM";
        final String metaValue_generic_DateFormatItem_yM = "M/y";
        final String metaValue_generic_DateFormatItem_yMMMM = "MMMM y";
        final String metaValue_generic_DateFormatItem_MMMMW = "MMMM \u098f\u09b0 W\u09af\u09bc \u09b8\u09aa\u09cd\u09a4\u09be\u09b9";
        final String metaValue_generic_DateFormatItem_yQQQQ = "QQQQ y";
        final String[] metaValue_MonthAbbreviations = new String[] {
            "\u099c\u09be\u09a8\u09c1",
            "\u09ab\u09c7\u09ac",
            "\u09ae\u09be\u09b0\u09cd\u099a",
            "\u098f\u09aa\u09cd\u09b0\u09bf",
            "\u09ae\u09c7",
            "\u099c\u09c1\u09a8",
            "\u099c\u09c1\u09b2",
            "\u0986\u0997",
            "\u09b8\u09c7\u09aa",
            "\u0985\u0995\u09cd\u099f\u09cb",
            "\u09a8\u09ad\u09c7",
            "\u09a1\u09bf\u09b8\u09c7",
            "",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE, d MMMM, y G",
            "d MMMM, y G",
            "d MMM, y G",
            "d/M/y GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, d MMMM, y GGGG",
            "d MMMM, y GGGG",
            "d MMM, y GGGG",
            "d/M/y G",
        };
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
            "\u0986\u0997\u09c7 R.O.C.",
            "\u09ae\u09bf\u0999\u09cd\u0997\u09c1\u09af\u09bc\u09be",
        };
        final String[] metaValue_islamic_MonthNames = new String[] {
            "\u09ae\u09b9\u09b0\u09b0\u09ae",
            "\u09b8\u09ab\u09b0",
            "\u09b0\u09ac\u09bf\u0989\u09b2 \u0986\u0989\u09af\u09bc\u09be\u09b2",
            "\u09b0\u09ac\u09bf\u0989\u09b8 \u09b8\u09be\u09a8\u09bf",
            "\u099c\u09ae\u09be\u09a6\u09bf\u0989\u09b2 \u0986\u0989\u09af\u09bc\u09be\u09b2",
            "\u099c\u09ae\u09be\u09a6\u09bf\u0989\u09b8 \u09b8\u09be\u09a8\u09bf",
            "\u09b0\u099c\u09ac",
            "\u09b6\u09be\u2018\u09ac\u09be\u09a8",
            "\u09b0\u09ae\u099c\u09be\u09a8",
            "\u09b6\u09be\u0993\u09af\u09bc\u09be\u09b2",
            "\u099c\u09cd\u09ac\u09bf\u09b2\u0995\u09a6",
            "\u099c\u09cd\u09ac\u09bf\u09b2\u09b9\u099c\u09cd\u099c",
            "",
        };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
            "",
            "\u09af\u09c1\u0997",
        };
        final String metaValue_calendarname_gregorian = "\u0997\u09cd\u09b0\u09bf\u0997\u09cb\u09b0\u09bf\u09af\u09bc\u09be\u09a8 \u0995\u09cd\u09af\u09be\u09b2\u09c7\u09a8\u09cd\u09a1\u09be\u09b0";
        final String[] metaValue_ListPatterns_standard = new String[] {
            "",
            "",
            "{0} \u098f\u09ac\u0982 {1}",
            "{0} \u098f\u09ac\u0982 {1}",
            "",
        };
        final String[] metaValue_ListPatterns_or = new String[] {
            "",
            "",
            "{0}, \u09ac\u09be {1}",
            "{0} \u09ac\u09be {1}",
            "",
        };
        final String[] metaValue_ListPatterns_standard_narrow = new String[] {
            "",
            "",
            "{0}, {1}",
            "{0}, {1}",
            "",
        };
        final Object[][] data = new Object[][] {
            { "generic.DayNames", metaValue_generic_DayNames },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "generic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "generic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "generic.DateFormatItem.yyyyMMMM", "MMMM y G" },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "generic.DateFormatItem.yyyyQQQQ", "QQQQ y G" },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.yyyyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yyyyMEd", "E, d/M/y G" },
            { "generic.DateFormatItem.yyyyMd", "d/M/y G" },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "generic.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "generic.DateFormatItem.yyyyMM", "MM-y G" },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "generic.DateFormatItem.yyyyQQQ", "QQQ y G" },
            { "generic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "generic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "generic.DateFormatItem.yyyyM", "M/y G" },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "generic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "generic.DateFormatItem.yyyy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.y", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "MonthNames", metaValue_MonthNames },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "\u099c\u09be\u09a8\u09c1",
                    "\u09ab\u09c7\u09ac",
                    "\u09ae\u09be\u09b0\u09cd\u099a",
                    "\u098f\u09aa\u09cd\u09b0\u09bf\u09b2",
                    "\u09ae\u09c7",
                    "\u099c\u09c1\u09a8",
                    "\u099c\u09c1\u09b2\u09be\u0987",
                    "\u0986\u0997\u09b8\u09cd\u099f",
                    "\u09b8\u09c7\u09aa\u09cd\u099f\u09c7\u09ae\u09cd\u09ac\u09b0",
                    "\u0985\u0995\u09cd\u099f\u09cb\u09ac\u09b0",
                    "\u09a8\u09ad\u09c7\u09ae\u09cd\u09ac\u09b0",
                    "\u09a1\u09bf\u09b8\u09c7\u09ae\u09cd\u09ac\u09b0",
                    "",
                }
            },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "DayNames", metaValue_generic_DayNames },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "standalone.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "standalone.DayNarrows", metaValue_generic_DayNarrows },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "QuarterAbbreviations", metaValue_generic_QuarterNames },
            { "standalone.QuarterAbbreviations",
                new String[] {
                    "Q1",
                    "Q2",
                    "Q3",
                    "Q4",
                }
            },
            { "QuarterNarrows", metaValue_QuarterNarrows },
            { "standalone.QuarterNarrows", metaValue_QuarterNarrows },
            { "AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "java.time.long.Eras", metaValue_java_time_long_Eras },
            { "long.Eras", metaValue_java_time_long_Eras },
            { "java.time.Eras", metaValue_java_time_Eras },
            { "Eras", metaValue_java_time_Eras },
            { "java.time.narrow.Eras", metaValue_java_time_Eras },
            { "narrow.Eras", metaValue_java_time_Eras },
            { "field.era", "\u09af\u09c1\u0997" },
            { "field.year", "\u09ac\u099b\u09b0" },
            { "field.month", "\u09ae\u09be\u09b8" },
            { "field.week", "\u09b8\u09aa\u09cd\u09a4\u09be\u09b9" },
            { "field.weekday", "\u09b8\u09aa\u09cd\u09a4\u09be\u09b9\u09c7\u09b0 \u09a6\u09bf\u09a8" },
            { "field.dayperiod", "AM/PM" },
            { "field.hour", "\u0998\u09a3\u09cd\u099f\u09be" },
            { "timezone.gmtFormat", "GMT {0}" },
            { "timezone.regionFormat", "{0} \u09b8\u09ae\u09af\u09bc" },
            { "timezone.regionFormat.daylight", "{0} \u09a6\u09bf\u09ac\u09be\u09b2\u09cb\u0995 \u09b8\u09ae\u09af\u09bc" },
            { "timezone.regionFormat.standard", "{0} \u09ae\u09be\u09a8\u0995 \u09b8\u09ae\u09af\u09bc" },
            { "field.minute", "\u09ae\u09bf\u09a8\u09bf\u099f" },
            { "field.second", "\u09b8\u09c7\u0995\u09c7\u09a8\u09cd\u09a1" },
            { "field.zone", "\u09b8\u09ae\u09af\u09bc \u0985\u099e\u09cd\u099a\u09b2" },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM, y",
                    "d MMMM, y",
                    "d MMM, y",
                    "d/M/yy",
                }
            },
            { "DateTimePatterns", metaValue_generic_DateTimePatterns },
            { "PluralRules", "one:i = 0 or n = 1" },
            { "DayPeriodRules", "night1:20:00-04:00;morning2:06:00-12:00;afternoon1:12:00-16:00;morning1:04:00-06:00;afternoon2:16:00-18:00;evening1:18:00-20:00" },
            { "DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "buddhist.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "buddhist.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "buddhist.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "japanese.QuarterNarrows", metaValue_QuarterNarrows },
            { "japanese.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "japanese.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "japanese.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "japanese.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.QuarterNarrows", metaValue_QuarterNarrows },
            { "roc.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "java.time.roc.Eras", metaValue_java_time_roc_long_Eras },
            { "roc.Eras", metaValue_java_time_roc_long_Eras },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "roc.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "roc.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "roc.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "roc.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "roc.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic.MonthNames", metaValue_islamic_MonthNames },
            { "islamic.MonthAbbreviations", metaValue_islamic_MonthNames },
            { "islamic.MonthNarrows",
                new String[] {
                    "\u09e7",
                    "\u09e8",
                    "\u09e9",
                    "\u09ea",
                    "\u09eb",
                    "\u09ec",
                    "\u09ed",
                    "\u09ee",
                    "\u09ef",
                    "\u09e7\u09e6",
                    "\u09e7\u09e7",
                    "\u09e7\u09e8",
                    "",
                }
            },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.AmPmMarkers", metaValue_generic_AmPmMarkers },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-civil.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-civil.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-civil.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-civil.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-civil.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-umalqura.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-umalqura.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.MMMMEd", metaValue_generic_DateFormatItem_MMMMEd },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-umalqura.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-umalqura.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-umalqura.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-umalqura.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "calendarname.islamic-civil", "\u0987\u09b8\u09b2\u09be\u09ae\u09bf\u0995-\u09b8\u09bf\u09ad\u09bf\u09b2 \u09ac\u09b0\u09cd\u09b7\u09aa\u099e\u09cd\u099c\u09c0" },
            { "calendarname.islamic", "\u0987\u09b8\u09b2\u09be\u09ae\u09bf\u0995 \u0995\u09cd\u09af\u09be\u09b2\u09c7\u09a8\u09cd\u09a1\u09be\u09b0" },
            { "calendarname.buddhist", "\u09ac\u09cc\u09a6\u09cd\u09a7 \u0995\u09cd\u09af\u09be\u09b2\u09c7\u09a8\u09cd\u09a1\u09be\u09b0" },
            { "calendarname.japanese", "\u099c\u09be\u09aa\u09be\u09a8\u09bf \u0995\u09cd\u09af\u09be\u09b2\u09c7\u09a8\u09cd\u09a1\u09be\u09b0" },
            { "calendarname.roc", "\u09ae\u09bf\u0999\u09cd\u0997\u09c1\u0993 \u0995\u09cd\u09af\u09be\u09b2\u09c7\u09a8\u09cd\u09a1\u09be\u09b0" },
            { "calendarname.islamic-umalqura", "\u0987\u09b8\u09b2\u09be\u09ae\u09bf\u0995 \u09ac\u09b0\u09cd\u09b7\u09aa\u099e\u09cd\u099c\u09c0 (\u0989\u09ae\u09cd\u09ae\u09be \u0986\u09b2-\u0995\u09c1\u09b0\u0986)" },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "DefaultNumberingSystem", "beng" },
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
                    "#,##,##0.###",
                    "#,##,##0.00\u00a4",
                    "#,##,##0%",
                    "#,##,##0.00\u00a4;(#,##,##0.00\u00a4)",
                }
            },
            { "beng.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "%",
                    "\u09e6",
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
            { "beng.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4\u00a0#,##0.00",
                    "#,##0%",
                    "",
                }
            },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0\u00a0\u09b9\u09be other:0\u00a0\u09b9\u09be}",
                    "{one:00\u00a0\u09b9\u09be other:00\u00a0\u09b9\u09be}",
                    "{one:0\u00a0\u09b2\u09be other:0\u00a0\u09b2\u09be}",
                    "{one:00\u00a0\u09b2\u09be other:00\u00a0\u09b2\u09be}",
                    "{one:0\u00a0\u0995\u09cb other:0\u00a0\u0995\u09cb}",
                    "{one:00\u00a0\u0995\u09cb other:00\u00a0\u0995\u09cb}",
                    "{one:000\u00a0\u0995\u09cb other:000\u00a0\u0995\u09cb}",
                    "{one:00\u00a0\u09b6\u09a4\u00a0\u0995\u09cb other:00\u09b6\u09a4\u00a0\u0995\u09cb}",
                    "{one:000\u0995\u09cb other:000\u0995\u09cb}",
                    "{one:0\u00a0\u09b2\u09be'.'\u0995\u09cb'.' other:0\u00a0\u09b2\u09be'.'\u0995\u09cb'.'}",
                    "{one:00\u00a0\u09b2\u09be'.'\u0995\u09cb'.' other:00\u00a0\u09b2\u09be'.'\u0995\u09cb'.'}",
                    "{one:000\u00a0\u09b2\u09be'.'\u0995\u09cb'.' other:000\u00a0\u09b2\u09be'.'\u0995\u09cb'.'}",
                }
            },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' '\u09b9\u09be\u099c\u09be\u09b0 other:0' '\u09b9\u09be\u099c\u09be\u09b0}",
                    "{one:00' '\u09b9\u09be\u099c\u09be\u09b0 other:00' '\u09b9\u09be\u099c\u09be\u09b0}",
                    "{one:0' '\u09b2\u09be\u0996 other:0' '\u09b2\u09be\u0996}",
                    "{one:00' '\u09b2\u09be\u0996 other:00' '\u09b2\u09be\u0996}",
                    "{one:0' '\u0995\u09cb\u099f\u09bf other:0' '\u0995\u09cb\u099f\u09bf}",
                    "{one:00' '\u0995\u09cb\u099f\u09bf other:00' '\u0995\u09cb\u099f\u09bf}",
                    "{one:000' '\u0995\u09cb\u099f\u09bf other:000' '\u0995\u09cb\u099f\u09bf}",
                    "{one:0000' '\u0995\u09cb\u099f\u09bf other:0000' '\u0995\u09cb\u099f\u09bf}",
                    "{one:00000' '\u0995\u09cb\u099f\u09bf other:00000' '\u0995\u09cb\u099f\u09bf}",
                    "{one:0' '\u09b2\u09be\u0996' '\u0995\u09cb\u099f\u09bf other:0' '\u09b2\u09be\u0996' '\u0995\u09cb\u099f\u09bf}",
                    "{one:00' '\u09b2\u09be\u0996' '\u0995\u09cb\u099f\u09bf other:00' '\u09b2\u09be\u0996' '\u0995\u09cb\u099f\u09bf}",
                    "{one:000' '\u09b2\u09be\u0996' '\u0995\u09cb\u099f\u09bf other:000' '\u09b2\u09be\u0996' '\u0995\u09cb\u099f\u09bf}",
                }
            },
            { "ListPatterns_standard", metaValue_ListPatterns_standard },
            { "ListPatterns_standard-short", metaValue_ListPatterns_standard },
            { "ListPatterns_standard-narrow", metaValue_ListPatterns_standard_narrow },
            { "ListPatterns_or", metaValue_ListPatterns_or },
            { "ListPatterns_or-short", metaValue_ListPatterns_or },
            { "ListPatterns_or-narrow", metaValue_ListPatterns_or },
            { "ListPatterns_unit", metaValue_ListPatterns_standard },
            { "ListPatterns_unit-short", metaValue_ListPatterns_standard_narrow },
            { "ListPatterns_unit-narrow", metaValue_ListPatterns_standard },
        };
        return data;
    }
}
