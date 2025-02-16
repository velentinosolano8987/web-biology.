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

public class FormatData_as extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "\u09aa\u09c2\u09f0\u09cd\u09ac\u09be\u09b9\u09cd\u09a8",
            "\u0985\u09aa\u09f0\u09be\u09b9\u09cd\u09a8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
        };
        final String metaValue_generic_DateFormatItem_yyyy = "y G";
        final String[] metaValue_MonthNames = new String[] {
            "\u099c\u09be\u09a8\u09c1\u09f1\u09be\u09f0\u09c0",
            "\u09ab\u09c7\u09ac\u09cd\u09f0\u09c1\u09f1\u09be\u09f0\u09c0",
            "\u09ae\u09be\u09f0\u09cd\u099a",
            "\u098f\u09aa\u09cd\u09f0\u09bf\u09b2",
            "\u09ae\u09c7\u2019",
            "\u099c\u09c1\u09a8",
            "\u099c\u09c1\u09b2\u09be\u0987",
            "\u0986\u0997\u09b7\u09cd\u099f",
            "\u099b\u09c7\u09aa\u09cd\u09a4\u09c7\u09ae\u09cd\u09ac\u09f0",
            "\u0985\u0995\u09cd\u099f\u09cb\u09ac\u09f0",
            "\u09a8\u09f1\u09c7\u09ae\u09cd\u09ac\u09f0",
            "\u09a1\u09bf\u099a\u09c7\u09ae\u09cd\u09ac\u09f0",
            "",
        };
        final String[] metaValue_MonthAbbreviations = new String[] {
            "\u099c\u09be\u09a8\u09c1",
            "\u09ab\u09c7\u09ac\u09cd\u09f0\u09c1",
            "\u09ae\u09be\u09f0\u09cd\u099a",
            "\u098f\u09aa\u09cd\u09f0\u09bf\u09b2",
            "\u09ae\u09c7\u2019",
            "\u099c\u09c1\u09a8",
            "\u099c\u09c1\u09b2\u09be\u0987",
            "\u0986\u0997",
            "\u099b\u09c7\u09aa\u09cd\u09a4\u09c7",
            "\u0985\u0995\u09cd\u099f\u09cb",
            "\u09a8\u09f1\u09c7",
            "\u09a1\u09bf\u099a\u09c7",
            "",
        };
        final String[] metaValue_MonthNarrows = new String[] {
            "\u099c",
            "\u09ab",
            "\u09ae",
            "\u098f",
            "\u09ae",
            "\u099c",
            "\u099c",
            "\u0986",
            "\u099b",
            "\u0985",
            "\u09a8",
            "\u09a1",
            "",
        };
        final String[] metaValue_generic_DayNames = new String[] {
            "\u09a6\u09c7\u0993\u09ac\u09be\u09f0",
            "\u09b8\u09cb\u09ae\u09ac\u09be\u09f0",
            "\u09ae\u0999\u09cd\u0997\u09b2\u09ac\u09be\u09f0",
            "\u09ac\u09c1\u09a7\u09ac\u09be\u09f0",
            "\u09ac\u09c3\u09b9\u09b8\u09cd\u09aa\u09a4\u09bf\u09ac\u09be\u09f0",
            "\u09b6\u09c1\u0995\u09cd\u09f0\u09ac\u09be\u09f0",
            "\u09b6\u09a8\u09bf\u09ac\u09be\u09f0",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "\u09a6\u09c7\u0993",
            "\u09b8\u09cb\u09ae",
            "\u09ae\u0999\u09cd\u0997\u09b2",
            "\u09ac\u09c1\u09a7",
            "\u09ac\u09c3\u09b9",
            "\u09b6\u09c1\u0995\u09cd\u09f0",
            "\u09b6\u09a8\u09bf",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "\u09a6",
            "\u09b8",
            "\u09ae",
            "\u09ac",
            "\u09ac",
            "\u09b6",
            "\u09b6",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "\u09aa\u09cd\u09f0\u09a5\u09ae \u09a4\u09bf\u09a8\u09bf\u09ae\u09be\u09b9",
            "\u09a6\u09cd\u09ac\u09bf\u09a4\u09c0\u09af\u09bc \u09a4\u09bf\u09a8\u09bf\u09ae\u09be\u09b9",
            "\u09a4\u09c3\u09a4\u09c0\u09af\u09bc \u09a4\u09bf\u09a8\u09bf\u09ae\u09be\u09b9",
            "\u099a\u09a4\u09c1\u09f0\u09cd\u09a5 \u09a4\u09bf\u09a8\u09bf\u09ae\u09be\u09b9",
        };
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "\u09e7\u09ae\u0983 \u09a4\u09bf\u0983",
            "\u09e8\u09af\u09bc\u0983 \u09a4\u09bf\u0983",
            "\u09e9\u09af\u09bc\u0983 \u09a4\u09bf\u0983",
            "\u09ea\u09f0\u09cd\u09a5\u0983 \u09a4\u09bf\u0983",
        };
        final String[] metaValue_QuarterNarrows = new String[] {
            "\u09e7",
            "\u09e8",
            "\u09e9",
            "\u09ea",
        };
        final String[] metaValue_java_time_long_Eras = new String[] {
            "\u0996\u09cd\u09f0\u09c0\u09b7\u09cd\u099f\u09aa\u09c2\u09f0\u09cd\u09ac",
            "\u0996\u09cd\u09f0\u09c0\u09b7\u09cd\u099f\u09be\u09ac\u09cd\u09a6",
        };
        final String[] metaValue_java_time_Eras = new String[] {
            "\u0996\u09cd\u09f0\u09c0\u0983 \u09aa\u09c2\u0983",
            "\u0996\u09cd\u09f0\u09c0\u0983",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "a h.mm.ss zzzz",
            "a h.mm.ss z",
            "a h.mm.ss",
            "a h.mm",
        };
        final String metaValue_generic_DateFormatItem_hm = "a h:mm";
        final String metaValue_generic_DateFormatItem_yMMMEd = "E, d MMM y";
        final String metaValue_generic_DateFormatItem_Ehms = "E a h:mm:ss";
        final String metaValue_generic_DateFormatItem_Ehm = "E a h:mm";
        final String metaValue_generic_DateFormatItem_yMEd = "E, dd-MM-y";
        final String metaValue_generic_DateFormatItem_hms = "a h:mm:ss";
        final String metaValue_generic_DateFormatItem_hmv = "a h:mm v";
        final String metaValue_generic_DateFormatItem_Bhms = "B h:mm:ss";
        final String metaValue_generic_DateFormatItem_hmsv = "a h:mm:ss v";
        final String metaValue_generic_DateFormatItem_yMMMd = "d MMM y";
        final String metaValue_generic_DateFormatItem_yw = "Y\u09f0 \u09b8\u09aa\u09cd\u09a4\u09be\u09b9 w";
        final String metaValue_generic_DateFormatItem_yQQQ = "QQQ y";
        final String metaValue_generic_DateFormatItem_yMMM = "MMM y";
        final String metaValue_generic_DateFormatItem_Md = "dd-MM";
        final String metaValue_generic_DateFormatItem_EBhms = "E B h:mm:ss";
        final String metaValue_generic_DateFormatItem_Ed = "E d";
        final String metaValue_generic_DateFormatItem_EBhm = "E B h:mm";
        final String metaValue_generic_DateFormatItem_MMMMd = "d MMMM";
        final String metaValue_generic_DateFormatItem_Bhm = "B h:mm";
        final String metaValue_generic_DateFormatItem_MEd = "E, dd-MM";
        final String metaValue_generic_DateFormatItem_MMMEd = "E, d MMM";
        final String metaValue_generic_DateFormatItem_Bh = "B h";
        final String metaValue_generic_DateFormatItem_h = "a h";
        final String metaValue_generic_DateFormatItem_GyMd = "d/M/y GGGGG";
        final String metaValue_generic_DateFormatItem_yMd = "dd-MM-y";
        final String metaValue_generic_DateFormatItem_MMMd = "d MMM";
        final String metaValue_generic_DateFormatItem_yM = "MM-y";
        final String metaValue_generic_DateFormatItem_yMMMM = "MMMM y";
        final String metaValue_generic_DateFormatItem_MMMMW = "MMMM\u09f0 \u09b8\u09aa\u09cd\u09a4\u09be\u09b9 W";
        final String metaValue_generic_DateFormatItem_yQQQQ = "QQQQ y";
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "G y MMMM d, EEEE",
            "G y MMMM d",
            "G y MMM d",
            "GGGGG y-MM-dd",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "GGGG y MMMM d, EEEE",
            "GGGG y MMMM d",
            "GGGG y MMM d",
            "G y-MM-dd",
        };
        final String metaValue_calendarname_gregorian = "\u0997\u09cd\u09f0\u09c7\u0997\u09cb\u09f0\u09bf\u09af\u09bc\u09be\u09a8 \u0995\u09c7\u09b2\u09c7\u09a3\u09cd\u09a1\u09be\u09f0";
        final String[] metaValue_ListPatterns_standard = new String[] {
            "",
            "",
            "{0} \u0986\u09f0\u09c1 {1}",
            "{0} \u0986\u09f0\u09c1 {1}",
            "",
        };
        final String[] metaValue_ListPatterns_or = new String[] {
            "",
            "",
            "{0} \u09ac\u09be {1}",
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
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.DateTimePatterns",
                new String[] {
                    "{1} {0} \u09ac\u099c\u09be\u09a4",
                    "{1} {0} \u09ac\u099c\u09be\u09a4",
                    "{1} {0}",
                    "{1} {0}",
                }
            },
            { "generic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "generic.DateFormatItem.yyyyMMMM", "MMMM y G" },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "generic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "generic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "generic.DateFormatItem.yyyyMMMd", "d MMM y G" },
            { "generic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "generic.DateFormatItem.yyyyMMMEd", "E, MMM d, y G" },
            { "generic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yyyyMEd", "E, dd-MM-y GGGGG" },
            { "generic.DateFormatItem.yyyyMd", "dd-MM-y GGGGG" },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "generic.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.yyyyMMM", "MMM y G" },
            { "generic.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "generic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "generic.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "generic.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "generic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "generic.DateFormatItem.yyyyM", "MM-y GGGGG" },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "generic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "generic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "generic.DateFormatItem.yyyy", metaValue_generic_DateFormatItem_yyyy },
            { "generic.DateFormatItem.y", metaValue_generic_DateFormatItem_yyyy },
            { "MonthNames", metaValue_MonthNames },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
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
            { "QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "QuarterNarrows", metaValue_QuarterNarrows },
            { "standalone.QuarterNarrows", metaValue_QuarterNarrows },
            { "AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "java.time.long.Eras", metaValue_java_time_long_Eras },
            { "long.Eras", metaValue_java_time_long_Eras },
            { "java.time.Eras", metaValue_java_time_Eras },
            { "Eras", metaValue_java_time_Eras },
            { "java.time.narrow.Eras", metaValue_java_time_Eras },
            { "narrow.Eras", metaValue_java_time_Eras },
            { "field.era", "\u09af\u09c1\u0997" },
            { "field.year", "\u09ac\u099b\u09f0" },
            { "field.month", "\u09ae\u09be\u09b9" },
            { "field.week", "\u09b8\u09aa\u09cd\u09a4\u09be\u09b9" },
            { "field.weekday", "\u09b8\u09aa\u09cd\u09a4\u09be\u09b9\u09f0 \u09a6\u09bf\u09a8" },
            { "field.dayperiod", "\u09aa\u09c2\u09f0\u09cd\u09ac\u09be\u09b9\u09cd\u09a8/\u0985\u09aa\u09f0\u09be\u09b9\u09cd\u09a8" },
            { "field.hour", "\u0998\u09a3\u09cd\u099f\u09be" },
            { "timezone.regionFormat", "{0} \u09b8\u09ae\u09af\u09bc" },
            { "timezone.regionFormat.daylight", "{0} (+1) \u09a1\u09c7\u09b2\u09be\u0987\u099f \u09b8\u09ae\u09af\u09bc" },
            { "timezone.regionFormat.standard", "{0} (+0) \u09ae\u09be\u09a8 \u09b8\u09ae\u09af\u09bc" },
            { "field.minute", "\u09ae\u09bf\u09a8\u09bf\u099f" },
            { "field.second", "\u099b\u09c7\u0995\u09c7\u09a3\u09cd\u09a1" },
            { "field.zone", "\u09b8\u09ae\u09af\u09bc \u0995\u09cd\u09b7\u09c7\u09a4\u09cd\u09f0" },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "DatePatterns",
                new String[] {
                    "EEEE, d MMMM, y",
                    "d MMMM, y",
                    "dd-MM-y",
                    "d-M-y",
                }
            },
            { "DateTimePatterns",
                new String[] {
                    "{1} {0}",
                    "{1} {0}",
                    "{1} {0}",
                    "{1} {0}",
                }
            },
            { "PluralRules", "one:i = 0 or n = 1" },
            { "DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "buddhist.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "buddhist.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "buddhist.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "buddhist.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "buddhist.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "buddhist.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "buddhist.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "buddhist.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "buddhist.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "buddhist.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "buddhist.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "buddhist.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.QuarterNarrows", metaValue_QuarterNarrows },
            { "japanese.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "japanese.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "japanese.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "japanese.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "japanese.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "japanese.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "japanese.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "japanese.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "japanese.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "japanese.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "japanese.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "japanese.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "roc.QuarterNarrows", metaValue_QuarterNarrows },
            { "roc.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "roc.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "roc.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "roc.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "roc.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "roc.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "roc.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "roc.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "roc.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "roc.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "roc.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.abbreviated.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "islamic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "islamic.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "islamic.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-civil.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic-civil.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-civil.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-civil.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "islamic-civil.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-civil.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-civil.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "islamic-civil.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-civil.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "islamic-civil.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic-civil.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-civil.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-civil.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-umalqura.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic-umalqura.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-umalqura.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-umalqura.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-umalqura.DateFormatItem.Bhms", metaValue_generic_DateFormatItem_Bhms },
            { "islamic-umalqura.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.yw", metaValue_generic_DateFormatItem_yw },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.EBhms", metaValue_generic_DateFormatItem_EBhms },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-umalqura.DateFormatItem.EBhm", metaValue_generic_DateFormatItem_EBhm },
            { "islamic-umalqura.DateFormatItem.MMMMd", metaValue_generic_DateFormatItem_MMMMd },
            { "islamic-umalqura.DateFormatItem.Bhm", metaValue_generic_DateFormatItem_Bhm },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.Bh", metaValue_generic_DateFormatItem_Bh },
            { "islamic-umalqura.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic-umalqura.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.MMMd", metaValue_generic_DateFormatItem_MMMd },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-umalqura.DateFormatItem.MMMMW", metaValue_generic_DateFormatItem_MMMMW },
            { "islamic-umalqura.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "calendarname.islamic-civil", "\u09b9\u09bf\u099c\u09f0\u09bf \u0995\u09c7\u09b2\u09c7\u09a3\u09cd\u09a1\u09be\u09f0 (\u099f\u09c7\u09ac\u09c1\u09b2\u09be\u09f0, \u09a8\u09be\u0997\u09f0\u09bf\u0995 \u09af\u09c1\u0997)" },
            { "calendarname.islamic", "\u09b9\u09bf\u099c\u09f0\u09bf \u0995\u09c7\u09b2\u09c7\u09a3\u09cd\u09a1\u09be\u09f0" },
            { "calendarname.buddhist", "\u09ac\u09cc\u09a6\u09cd\u09a7 \u0995\u09c7\u09b2\u09c7\u09a3\u09cd\u09a1\u09be\u09f0" },
            { "calendarname.japanese", "\u099c\u09be\u09aa\u09be\u09a8\u09c0 \u0995\u09c7\u09b2\u09c7\u09a3\u09cd\u09a1\u09be\u09f0" },
            { "calendarname.roc", "\u099a\u09c0\u09a8\u09be \u09aa\u09cd\u09f0\u099c\u09be\u09a4\u09a8\u09cd\u09a4\u09cd\u09f0\u09f0 \u0995\u09c7\u09b2\u09c7\u09a3\u09cd\u09a1\u09be\u09f0" },
            { "calendarname.islamic-umalqura", "\u09b9\u09bf\u099c\u09f0\u09bf \u0995\u09c7\u09b2\u09c7\u09a3\u09cd\u09a1\u09be\u09f0 (\u0989\u09ae \u0985\u09b2-\u0995\u09c1\u09f0\u09be)" },
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
                    "\u00a4\u00a0#,##,##0.00",
                    "#,##,##0%",
                    "\u00a4#,##0.00;(\u00a4#,##0.00)",
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
                    "{one:0\u00a0\u09b9\u09be\u099c\u09be\u09f0 other:0\u00a0\u09b9\u09be\u099c\u09be\u09f0}",
                    "{one:00\u00a0\u09b9\u09be\u099c\u09be\u09f0 other:00\u00a0\u09b9\u09be\u099c\u09be\u09f0}",
                    "{one:0\u00a0\u09b2\u09be\u0996 other:0\u00a0\u09b2\u09be\u0996}",
                    "{one:0\u00a0\u09a8\u09bf\u09af\u09c1\u09a4 other:0\u00a0\u09a8\u09bf\u09af\u09c1\u09a4}",
                    "{one:00\u00a0\u09a8\u09bf\u09af\u09c1\u09a4 other:00\u00a0\u09a8\u09bf\u09af\u09c1\u09a4}",
                    "{one:000\u00a0\u09a8\u09bf\u0983 other:000\u00a0\u09a8\u09bf\u0983}",
                    "{one:0\u00a0\u09b6\u0983\u00a0\u0995\u09cb\u0983 other:0\u00a0\u09b6\u0983\u00a0\u0995\u09cb\u0983}",
                    "{one:00\u00a0\u09b6\u0983\u00a0\u0995\u09cb\u0983 other:00\u00a0\u09b6\u0983\u00a0\u0995\u09cb\u0983}",
                    "{one:000\u00a0\u09b6\u0983\u00a0\u0995\u0983 other:000\u00a0\u09b6\u0983\u00a0\u0995\u0983}",
                    "{one:0\u00a0\u09b6\u0983\u00a0\u09aa\u0983 other:0\u00a0\u09b6\u0983\u00a0\u09aa\u0983}",
                    "{one:00\u00a0\u09b6\u0983\u00a0\u09aa\u0983 other:00\u00a0\u09b6\u0983\u00a0\u09aa\u0983}",
                    "{one:000\u00a0\u09b6\u0983\u00a0\u09aa\u0983 other:000\u00a0\u09b6\u0983\u00a0\u09aa\u0983}",
                }
            },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' '\u09b9\u09be\u099c\u09be\u09f0 other:0' '\u09b9\u09be\u099c\u09be\u09f0}",
                    "{one:00' '\u09b9\u09be\u099c\u09be\u09f0 other:00' '\u09b9\u09be\u099c\u09be\u09f0}",
                    "{one:0' '\u09b2\u09be\u0996 other:0' '\u09b2\u09be\u0996}",
                    "{one:0' '\u09a8\u09bf\u09af\u09c1\u09a4 other:0' '\u09a8\u09bf\u09af\u09c1\u09a4}",
                    "{one:00' '\u09a8\u09bf\u09af\u09c1\u09a4 other:00' '\u09a8\u09bf\u09af\u09c1\u09a4}",
                    "{one:000' '\u09a8\u09bf\u09af\u09c1\u09a4 other:000' '\u09a8\u09bf\u09af\u09c1\u09a4}",
                    "{one:0' '\u09b6\u09a4' '\u0995\u09cb\u099f\u09bf other:0' '\u09b6\u09a4' '\u0995\u09cb\u099f\u09bf}",
                    "{one:00' '\u09b6\u09a4' '\u0995\u09cb\u099f\u09bf other:00' '\u09b6\u09a4' '\u0995\u09cb\u099f\u09bf}",
                    "{one:000' '\u09b6\u09a4' '\u0995\u09cb\u099f\u09bf other:000' '\u09b6\u09a4' '\u0995\u09cb\u099f\u09bf}",
                    "{one:0' '\u09b6\u09a4' '\u09aa\u09f0\u09be\u09f0\u09cd\u09a6\u09cd\u09a7 other:0' '\u09b6\u09a4' '\u09aa\u09f0\u09be\u09f0\u09cd\u09a6\u09cd\u09a7}",
                    "{one:00' '\u09b6\u09a4' '\u09aa\u09f0\u09be\u09f0\u09cd\u09a6\u09cd\u09a7 other:00' '\u09b6\u09a4' '\u09aa\u09f0\u09be\u09f0\u09cd\u09a6\u09cd\u09a7}",
                    "{one:000' '\u09b6\u09a4' '\u09aa\u09f0\u09be\u09f0\u09cd\u09a6\u09cd\u09a7 other:000' '\u09b6\u09a4' '\u09aa\u09f0\u09be\u09f0\u09cd\u09a6\u09cd\u09a7}",
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
