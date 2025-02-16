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

public class FormatData_es_MX extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String metaValue_generic_DateFormatItem_yyyyMMMd = "d MMM y G";
        final String[] metaValue_MonthAbbreviations = new String[] {
            "ene",
            "feb",
            "mar",
            "abr",
            "may",
            "jun",
            "jul",
            "ago",
            "sep",
            "oct",
            "nov",
            "dic",
            "",
        };
        final String[] metaValue_generic_narrow_AmPmMarkers = new String[] {
            "a.\u202fm.",
            "p.\u202fm.",
            "",
            "del mediod\u00eda",
            "de la madrugada",
            "de la ma\u00f1ana",
            "",
            "",
            "de la tarde",
            "",
            "de la noche",
            "",
        };
        final String[] metaValue_generic_TimePatterns = new String[] {
            "h:mm:ss\u202fa zzzz",
            "h:mm:ss\u202fa z",
            "h:mm:ss\u202fa",
            "h:mm\u202fa",
        };
        final String metaValue_generic_DateFormatItem_MMdd = "dd/MM";
        final String metaValue_generic_DateFormatItem_yMMMEd = "EEE, d 'de' MMM 'de' y";
        final String metaValue_generic_DateFormatItem_yMEd = "E, d/M/y";
        final String metaValue_generic_DateFormatItem_yQQQ = "QQQ y";
        final String metaValue_generic_DateFormatItem_Hmsvvvv = "HH:mm:ss (vvvv)";
        final String metaValue_generic_DateFormatItem_MMd = "d/MM";
        final String metaValue_generic_DateFormatItem_MMMEd = "E d 'de' MMM";
        final String metaValue_generic_DateFormatItem_yMM = "MM/y";
        final String metaValue_DateFormatItem_Ehms = "E h:mm:ss\u202fa";
        final String metaValue_DateFormatItem_Ehm = "E h:mm\u202fa";
        final String metaValue_DateFormatItem_EHms = "E HH:mm:ss";
        final String metaValue_DateFormatItem_EHm = "E HH:mm";
        final Object[][] data = new Object[][] {
            { "generic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "generic.TimePatterns", metaValue_generic_TimePatterns },
            { "generic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "generic.DateFormatItem.hm", "hh:mm\u202fa" },
            { "generic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "generic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "generic.DateFormatItem.hms", "hh:mm:ss\u202fa" },
            { "generic.DateFormatItem.yyyyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateFormatItem.yyyyMMMEd", "EEE, d MMM y G" },
            { "generic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "generic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "generic.DateFormatItem.yyyyMEd", "E, d/M/y GGGGG" },
            { "generic.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "generic.DateFormatItem.yyyyMMM", "MMM y G" },
            { "generic.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "generic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "generic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "generic.DateFormatItem.yyyyQQQ", "QQQ y G" },
            { "generic.DateFormatItem.h", "hh\u202fa" },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "TimePatterns", metaValue_generic_TimePatterns },
            { "DatePatterns",
                new String[] {
                    "EEEE, d 'de' MMMM 'de' y",
                    "d 'de' MMMM 'de' y",
                    "d MMM y",
                    "dd/MM/yy",
                }
            },
            { "DateTimePatterns",
                new String[] {
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                }
            },
            { "DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_generic_TimePatterns },
            { "buddhist.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "buddhist.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "buddhist.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "buddhist.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "buddhist.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "buddhist.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "buddhist.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "buddhist.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "buddhist.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "buddhist.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "buddhist.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "buddhist.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "buddhist.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "japanese.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_generic_TimePatterns },
            { "japanese.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "japanese.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "japanese.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "japanese.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "japanese.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "japanese.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "japanese.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "japanese.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "japanese.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "japanese.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "japanese.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "japanese.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "japanese.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "roc.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "roc.TimePatterns", metaValue_generic_TimePatterns },
            { "roc.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "roc.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "roc.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "roc.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "roc.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "roc.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "roc.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "roc.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "roc.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "roc.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "roc.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "roc.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "roc.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic.narrow.AmPmMarkers", metaValue_generic_narrow_AmPmMarkers },
            { "islamic.TimePatterns", metaValue_generic_TimePatterns },
            { "islamic.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "islamic.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "islamic.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "islamic.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "islamic.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "islamic.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "islamic.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-civil.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-civil.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-civil.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "islamic-civil.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "islamic-civil.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-civil.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-civil.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-civil.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "islamic-civil.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "islamic-civil.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "islamic-civil.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "islamic-civil.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-civil.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "islamic-umalqura.DateFormatItem.MMdd", metaValue_generic_DateFormatItem_MMdd },
            { "islamic-umalqura.DateFormatItem.yMMMEd", metaValue_generic_DateFormatItem_yMMMEd },
            { "islamic-umalqura.DateFormatItem.Ehms", metaValue_DateFormatItem_Ehms },
            { "islamic-umalqura.DateFormatItem.Ehm", metaValue_DateFormatItem_Ehm },
            { "islamic-umalqura.DateFormatItem.yMEd", metaValue_generic_DateFormatItem_yMEd },
            { "islamic-umalqura.DateFormatItem.GyMMMd", metaValue_generic_DateFormatItem_yyyyMMMd },
            { "islamic-umalqura.DateFormatItem.yQQQ", metaValue_generic_DateFormatItem_yQQQ },
            { "islamic-umalqura.DateFormatItem.Hmsvvvv", metaValue_generic_DateFormatItem_Hmsvvvv },
            { "islamic-umalqura.DateFormatItem.EHms", metaValue_DateFormatItem_EHms },
            { "islamic-umalqura.DateFormatItem.EHm", metaValue_DateFormatItem_EHm },
            { "islamic-umalqura.DateFormatItem.MMd", metaValue_generic_DateFormatItem_MMd },
            { "islamic-umalqura.DateFormatItem.MMMEd", metaValue_generic_DateFormatItem_MMMEd },
            { "islamic-umalqura.DateFormatItem.yMM", metaValue_generic_DateFormatItem_yMM },
            { "calendarname.roc", "calendario minguo" },
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
                    "",
                }
            },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0\u00a0k other:0\u00a0k}",
                    "{one:00\u00a0k other:00\u00a0k}",
                    "{one:000\u00a0k other:000\u00a0k}",
                }
            },
            { "long.CompactNumberPatterns",
                new String[] {
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
                    "",
                    "",
                    "{one:0' 'bill\u00f3n other:0' 'billones}",
                    "{one:00' 'billones other:00' 'billones}",
                    "{one:000' 'billones other:000' 'billones}",
                }
            },
        };
        return data;
    }
}
