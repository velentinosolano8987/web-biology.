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

public class FormatData_xh extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String metaValue_generic_DateFormatItem_Gy = "y G";
        final String metaValue_generic_DateFormatItem_yyyyMMM = "MMM y G";
        final String metaValue_generic_DateFormatItem_yyyyMMMd = "MMM d, y G";
        final String metaValue_generic_DateFormatItem_yyyyMMMEd = "E, MMM d, y G";
        final String[] metaValue_generic_DayNames = new String[] {
            "Cawe",
            "Mvulo",
            "Lwesibini",
            "Lwesithathu",
            "Lwesine",
            "Lwesihlanu",
            "Mgqibelo",
        };
        final String[] metaValue_generic_DayAbbreviations = new String[] {
            "Caw",
            "Mvu",
            "Lwesb",
            "Tha",
            "Sin",
            "Hla",
            "Mgq",
        };
        final String[] metaValue_generic_DayNarrows = new String[] {
            "C",
            "M",
            "Sb",
            "Tht",
            "Sin",
            "Hl",
            "Mgq",
        };
        final String[] metaValue_generic_QuarterNames = new String[] {
            "ikota yoku-1",
            "ikota yesi-2",
            "ikota yesi-3",
            "ikota yesi-4",
        };
        final String[] metaValue_generic_QuarterAbbreviations = new String[] {
            "Kota 1",
            "Kota 2",
            "Kota 3",
            "Kota 4",
        };
        final String[] metaValue_java_time_long_Eras = new String[] {
            "BC",
            "AD",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "HH:mm:ss zzzz",
            "HH:mm:ss z",
            "HH:mm:ss",
            "HH:mm",
        };
        final String metaValue_generic_DateFormatItem_hm = "h:mm\u202fa";
        final String metaValue_generic_DateFormatItem_Ehm = "E h:mm\u202fa";
        final String metaValue_generic_DateFormatItem_hms = "h:mm:ss\u202fa";
        final String metaValue_generic_DateFormatItem_hmv = "h:mm\u202fa v";
        final String metaValue_generic_DateFormatItem_hmsv = "h:mm:ss\u202fa v";
        final String metaValue_generic_DateFormatItem_yQQQ = "QQQ y";
        final String metaValue_generic_DateFormatItem_MMMEd = "E, MMM d";
        final String metaValue_generic_DateFormatItem_h = "h\u202fa";
        final String metaValue_generic_DateFormatItem_GyMd = "M/d/y G";
        final String metaValue_generic_DateFormatItem_yMMMEd = "E, MMM d, y";
        final String metaValue_generic_DateFormatItem_Ehms = "E h:mm:ss\u202fa";
        final String metaValue_generic_DateFormatItem_yMEd = "E, M/d/y";
        final String metaValue_generic_DateFormatItem_yMMMd = "MMM d, y";
        final String metaValue_generic_DateFormatItem_yMMM = "MMM y";
        final String metaValue_generic_DateFormatItem_Md = "M/d";
        final String metaValue_generic_DateFormatItem_Ed = "d E";
        final String metaValue_generic_DateFormatItem_MEd = "E, M/d";
        final String metaValue_generic_DateFormatItem_yMd = "M/d/y";
        final String metaValue_generic_DateFormatItem_yM = "M/y";
        final String metaValue_generic_DateFormatItem_yMMMM = "MMMM y";
        final String metaValue_generic_DateFormatItem_yQQQQ = "QQQQ y";
        final String[] metaValue_MonthNames = new String[] {
            "Janyuwari",
            "Februwari",
            "Matshi",
            "Epreli",
            "Meyi",
            "Juni",
            "Julayi",
            "Agasti",
            "Septemba",
            "Okthobha",
            "Novemba",
            "Disemba",
            "",
        };
        final String[] metaValue_MonthAbbreviations = new String[] {
            "Jan",
            "Feb",
            "Mat",
            "Epr",
            "Mey",
            "Jun",
            "Jul",
            "Aga",
            "Sept",
            "Okt",
            "Nov",
            "Dis",
            "",
        };
        final String[] metaValue_java_time_generic_DatePatterns = new String[] {
            "EEEE, MMMM d, y G",
            "MMMM d, y G",
            "MMM d, y G",
            "M/d/y GGGGG",
        };
        final String[] metaValue_generic_DatePatterns = new String[] {
            "EEEE, MMMM d, y GGGG",
            "MMMM d, y GGGG",
            "MMM d, y GGGG",
            "M/d/y G",
        };
        final String metaValue_calendarname_gregorian = "Ngokwekhalenda YeGregorian";
        final Object[][] data = new Object[][] {
            { "generic.DayNames", metaValue_generic_DayNames },
            { "generic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "generic.DayNarrows", metaValue_generic_DayNarrows },
            { "generic.QuarterNames", metaValue_generic_QuarterNames },
            { "generic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.generic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "generic.DatePatterns", metaValue_generic_DatePatterns },
            { "generic.DateTimePatterns",
                new String[] {
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                }
            },
            { "generic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "generic.DateFormatItem.yyyyMMMM", "MMMM y G" },
            { "generic.DateFormatItem.yyyyQQQQ", "QQQQ y G" },
            { "generic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "generic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "generic.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "generic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yyyyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "generic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "generic.DateFormatItem.yyyy", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.y", metaValue_generic_DateFormatItem_Gy },
            { "generic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "generic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.DateFormatItem.yyyyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "generic.DateFormatItem.yyyyMEd", "E, M/d/y GGGGG" },
            { "generic.DateFormatItem.yyyyMd", "M/d/y GGGGG" },
            { "generic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "generic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "generic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "generic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "generic.DateFormatItem.yyyyQQQ", "QQQ y G" },
            { "generic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "generic.DateFormatItem.yyyyM", "M/y GGGGG" },
            { "generic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "generic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "generic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "generic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "MonthNames", metaValue_MonthNames },
            { "standalone.MonthNames",
                new String[] {
                    "Janyuwari",
                    "Februwari",
                    "Matshi",
                    "Epreli",
                    "Meyi",
                    "Juni",
                    "Julayi",
                    "Agasti",
                    "Septemba",
                    "Okthoba",
                    "Novemba",
                    "Disemba",
                    "",
                }
            },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.MonthAbbreviations",
                new String[] {
                    "Jan",
                    "Feb",
                    "Mat",
                    "Epr",
                    "Mey",
                    "Jun",
                    "Jul",
                    "Aga",
                    "Sep",
                    "Okt",
                    "Nov",
                    "Dis",
                    "",
                }
            },
            { "DayNames", metaValue_generic_DayNames },
            { "standalone.DayNames", metaValue_generic_DayNames },
            { "DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "standalone.DayAbbreviations",
                new String[] {
                    "Caw",
                    "Mvu",
                    "Bin",
                    "Tha",
                    "Sin",
                    "Hla",
                    "Mgq",
                }
            },
            { "DayNarrows", metaValue_generic_DayNarrows },
            { "standalone.DayNarrows",
                new String[] {
                    "C",
                    "M",
                    "Sb",
                    "St",
                    "Sin",
                    "Hl",
                    "Mgq",
                }
            },
            { "QuarterNames", metaValue_generic_QuarterNames },
            { "standalone.QuarterNames", metaValue_generic_QuarterNames },
            { "QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "standalone.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "java.time.long.Eras", metaValue_java_time_long_Eras },
            { "long.Eras", metaValue_java_time_long_Eras },
            { "java.time.Eras", metaValue_java_time_long_Eras },
            { "Eras", metaValue_java_time_long_Eras },
            { "java.time.narrow.Eras", metaValue_java_time_long_Eras },
            { "narrow.Eras", metaValue_java_time_long_Eras },
            { "field.era", "ixesha leminyaka" },
            { "field.year", "unyaka" },
            { "field.month", "inyanga" },
            { "field.week", "iveki" },
            { "field.weekday", "usuku lweveki" },
            { "field.dayperiod", "Kusasa/Emva kwemini" },
            { "field.hour", "iyure" },
            { "timezone.regionFormat", "{0} Time" },
            { "timezone.regionFormat.daylight", "{0} Daylight Time" },
            { "timezone.regionFormat.standard", "{0} Standard Time" },
            { "field.minute", "umzuzu" },
            { "field.second", "umzuzwana" },
            { "field.zone", "ingingqi yexesha" },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "DatePatterns",
                new String[] {
                    "EEEE, MMMM d, y",
                    "MMMM d, y",
                    "MMM d, y",
                    "M/d/yy",
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
            { "PluralRules", "one:n = 1" },
            { "DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.DayNames", metaValue_generic_DayNames },
            { "buddhist.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "buddhist.DayNarrows", metaValue_generic_DayNarrows },
            { "buddhist.QuarterNames", metaValue_generic_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "buddhist.DatePatterns", metaValue_generic_DatePatterns },
            { "buddhist.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "buddhist.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "buddhist.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "buddhist.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "buddhist.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "buddhist.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "buddhist.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "buddhist.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "buddhist.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "buddhist.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "buddhist.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "buddhist.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "buddhist.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "buddhist.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "buddhist.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "buddhist.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "buddhist.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "japanese.DayNames", metaValue_generic_DayNames },
            { "japanese.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "japanese.DayNarrows", metaValue_generic_DayNarrows },
            { "japanese.QuarterNames", metaValue_generic_QuarterNames },
            { "japanese.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.japanese.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "japanese.DatePatterns", metaValue_generic_DatePatterns },
            { "japanese.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "japanese.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "japanese.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "japanese.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "japanese.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "japanese.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "japanese.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "japanese.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "japanese.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "japanese.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "japanese.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "japanese.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "japanese.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "japanese.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "japanese.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "japanese.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "japanese.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "roc.MonthNames", metaValue_MonthNames },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "roc.DayNames", metaValue_generic_DayNames },
            { "roc.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "roc.DayNarrows", metaValue_generic_DayNarrows },
            { "roc.QuarterNames", metaValue_generic_QuarterNames },
            { "roc.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.roc.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "roc.DatePatterns", metaValue_generic_DatePatterns },
            { "roc.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "roc.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "roc.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "roc.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "roc.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "roc.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "roc.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "roc.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "roc.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "roc.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "roc.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "roc.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "roc.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "roc.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "roc.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "roc.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "roc.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "roc.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic.DayNames", metaValue_generic_DayNames },
            { "islamic.DayAbbreviations", metaValue_generic_DayAbbreviations },
            { "islamic.DayNarrows", metaValue_generic_DayNarrows },
            { "islamic.QuarterNames", metaValue_generic_QuarterNames },
            { "islamic.QuarterAbbreviations", metaValue_generic_QuarterAbbreviations },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "java.time.islamic.DatePatterns", metaValue_java_time_generic_DatePatterns },
            { "islamic.DatePatterns", metaValue_generic_DatePatterns },
            { "islamic.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-civil.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic-civil.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-civil.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-civil.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-civil.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic-civil.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-civil.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-civil.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-civil.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-civil.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-civil.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-civil.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-civil.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic-civil.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-civil.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-civil.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-civil.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "islamic-umalqura.DateFormatItem.hm", metaValue_generic_DateFormatItem_hm },
            { "islamic-umalqura.DateFormatItem.Ehm", metaValue_generic_DateFormatItem_Ehm },
            { "islamic-umalqura.DateFormatItem.hms", metaValue_generic_DateFormatItem_hms },
            { "islamic-umalqura.DateFormatItem.hmv", metaValue_generic_DateFormatItem_hmv },
            { "islamic-umalqura.DateFormatItem.Gy", metaValue_generic_DateFormatItem_Gy },
            { "islamic-umalqura.DateFormatItem.hmsv", metaValue_generic_DateFormatItem_hmsv },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.h", metaValue_generic_DateFormatItem_h },
            { "islamic-umalqura.DateFormatItem.GyMd", metaValue_generic_DateFormatItem_GyMd },
            { "islamic-umalqura.DateFormatItem.GyMMM", metaValue_generic_DateFormatItem_yyyyMMM },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.Ehms", metaValue_generic_DateFormatItem_Ehms },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-umalqura.DateFormatItem.yMMMd", metaValue_generic_DateFormatItem_yMMMd },
            { "islamic-umalqura.DateFormatItem.yMMM", metaValue_generic_DateFormatItem_yMMM },
            { "islamic-umalqura.DateFormatItem.Md", metaValue_generic_DateFormatItem_Md },
            { "islamic-umalqura.DateFormatItem.Ed", metaValue_generic_DateFormatItem_Ed },
            { "islamic-umalqura.DateFormatItem.MEd", metaValue_generic_DateFormatItem_MEd },
            { "islamic-umalqura.DateFormatItem.GyMMMEd", metaValue_generic_DateFormatItem_yyyyMMMEd },
            { "islamic-umalqura.DateFormatItem.yMd", metaValue_generic_DateFormatItem_yMd },
            { "islamic-umalqura.DateFormatItem.yM", metaValue_generic_DateFormatItem_yM },
            { "islamic-umalqura.DateFormatItem.yMMMM", metaValue_generic_DateFormatItem_yMMMM },
            { "islamic-umalqura.DateFormatItem.yQQQQ", metaValue_generic_DateFormatItem_yQQQQ },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
            { "latn.NumberElements",
                new String[] {
                    ".",
                    "\u00a0",
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
                    "",
                }
            },
            { "ListPatterns_or-narrow",
                new String[] {
                    "",
                    "",
                    "{0}, okanye {1}",
                    "{0} okanye {1}",
                    "",
                }
            },
        };
        return data;
    }
}
