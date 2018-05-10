package cis44project;

public class FullStockList
{
    Stock[] allStocks;

    public FullStockList()
    {
        allStocks = new Stock[]
                {
                        new Stock("Agilent Technologies", "A", 67.00),
                        new Stock("Alcoa Corp", "AA", 54.39),
                        new Stock("Aac Holdings Inc", "AAC", 11.51),
                        new Stock("Aaron's Inc", "AAN", 41.57),
                        new Stock("Advance Auto Parts Inc", "AAP", 1.07),
                        new Stock("American Assets Trust", "AAT", 34.16),
                        new Stock("Advantage Oil & Gas Ltd", "AAV", 3.00),
                        new Stock("Alliancebernstein Holding LP", "AB", 26.65),
                        new Stock("Abb Ltd", "ABB", 23.44),
                        new Stock("Abbvie Inc", "ABBV", 0.11),
                        new Stock("Amerisourcebergen Corp", "ABC", 86.37),
                        new Stock("Ambev S.A.", "ABEV", 6.33),
                        new Stock("Asbury Automotive Group Inc", "ABG", 70.55),
                        new Stock("ABM Industries Incorporated", "ABM", 30.32),
                        new Stock("Arbor Realty Trust", "ABR", 9.16),
                        new Stock("Arbor Realty Trust Inc", "ABR-A", 25.67),
                        new Stock("Arbor Realty Trust Inc", "ABR-B", 25.38),
                        new Stock("Arbor Realty Trust", "ABR-C", 26.04),
                        new Stock("Arbor Realty Trust 7.375% Senior", "ABRN", 25.34),
                        new Stock("Abbott Laboratories", "ABT", 58.74),
                        new Stock("Barrick Gold Corp", "ABX", 13.47),
                        new Stock("Associated Capital Group Inc", "AC", 37.50),
                        new Stock("American Campus Communities Inc", "ACC", 39.49),
                        new Stock("Acco Brands Corp", "ACCO", 11.80),
                        new Stock("Aluminum Corporation of China Ltd", "ACH", 13.81),
                        new Stock("Aecom Technology Corp", "ACM", 34.10),
                        new Stock("Accenture Plc", "ACN", 1.13),
                        new Stock("Avenue Income Credit Strategies", "ACP", 13.90),
                        new Stock("Ares Commercial Real Estate Cor", "ACRE", 13.42),
                        new Stock("Allianzgi Diversified Income &", "ACV", 22.74),
                        new Stock("Agree Realty Corp", "ADC", 49.72),
                        new Stock("Archer Daniels Midland Company", "ADM", 43.86),
                        new Stock("Adient Plc", "ADNT", 54.99),
                        new Stock("Alliance Data Systems Corp", "ADS", 1.22),
                        new Stock("Advanced Disposal Services Inc", "ADSW", 22.87),
                        new Stock("ADT Inc.", "ADT", 8.08),
                        new Stock("Adams Express Company", "ADX", 14.99),
                        new Stock("Aegon N.V. Perp Cap Secs Floating Rate", "AEB", 24.80),
                        new Stock("Aegon N.V. Perp Cap Secs [Ne]", "AED", 25.82),
                        new Stock("Ameren Corp", "AEE", 58.90),
                        new Stock("Aegon N.V.", "AEG", 7.03),
                        new Stock("Aegon N.V. Perp Cap Secs", "AEH", 25.72),
                        new Stock("Aegon Nv 8.00% Non-Cum Notes Due 2042", "AEK", 25.00),
                        new Stock("American Equity Investment Life", "AEL", 29.19),
                        new Stock("Agnico-Eagle Mines Ltd", "AEM", 42.74),
                        new Stock("American Eagle Outfitters", "AEO", 20.11),
                        new Stock("American Electric Power Company", "AEP", 69.39),
                        new Stock("Aercap Holdings N.V.", "AER", 54.18),
                        new Stock("The Aes Corp", "AES", 12.33),
                        new Stock("Aetna Inc", "AET", 0.08),
                        new Stock("Anadarko Petroleum Corp", "AEUA", 31.40),
                        new Stock("Alliance National Municipal", "AFB", 12.46),
                        new Stock("Allied Capital Corp", "AFC", 25.44),
                        new Stock("American Financial Group", "AFG", 1.06),
                        new Stock("American Financial Group Inc", "AFGE", 25.61),
                        new Stock("American Financial Group Inc", "AFGH", 25.22),
                        new Stock("Armstrong Flooring Inc", "AFI", 12.77),
                        new Stock("Aflac Incorporated", "AFL", 44.81),
                        new Stock("Amtrust Financial Services Inc", "AFS-A", 17.89),
                        new Stock("Amtrust Financial Services Dep Pfd", "AFS-B", 18.26),
                        new Stock("Amtrust Financial Services Series C", "AFS-C", 18.55),
                        new Stock("Amtrust Financial Services Dep Pfd", "AFS-D", 18.73),
                        new Stock("Amtrust Financial Services Inc Prf", "AFS-E", 21.38),
                        new Stock("Amtrust Financial Services Inc", "AFS-F", 18.00),
                        new Stock("Amtrust Financial Services Inc", "AFSS", 24.34),
                        new Stock("Amtrust Financial Services Inc", "AFST", 24.95),
                        new Stock("Apollo Senior Floating Rate Fund Inc", "AFT", 16.75),
                        new Stock("First Majestic Silver", "AG", 6.85),
                        new Stock("Advent Claymore Convertible Securities", "AGC", 5.70),
                        new Stock("Agco Corp", "AGCO", 60.19),
                        new Stock("Alpine Global Dynamic Dividend Fund", "AGD", 10.61),
                        new Stock("Alamos Gold Inc", "AGI", 5.37),
                        new Stock("Federal Agricultural Mortgage Corp", "AGM", 87.14),
                        new Stock("Federal Agricultural Mortgage", "AGM-A", 25.12),
                        new Stock("Federal Ag", "AGM-B", 25.94),
                        new Stock("Federal Agricultural Mortgage", "AGM-C", 26.48),
                        new Stock("Federal Agricultural Mortgage Corp", "AGM.A", 81.95),
                        new Stock("Allergan Plc", "AGN", 1.15),
                        new Stock("Assured Guaranty Ltd", "AGO", 36.13),
                        new Stock("Assured Guaranty Ltd [B]", "AGO-B", 25.73),
                        new Stock("Assured Guaranty Ltd [E]", "AGO-E", 25.30),
                        new Stock("Assured Guaranty Ltd [F]", "AGO-F", 24.81),
                        new Stock("Avangrid Inc", "AGR", 54.26),
                        new Stock("Adecoagro S.A.", "AGRO", 7.30),
                        new Stock("Playags Inc.", "AGS", 23.19),
                        new Stock("Argan Inc", "AGX", 38.40),
                        new Stock("A.H. Belo Corp", "AHC", 4.95),
                        new Stock("Armada Hoffler Properties Inc", "AHH", 13.93),
                        new Stock("Aspen Insurance Holdings", "AHL", 41.90),
                        new Stock("Aspen Ins Pfd Inc", "AHL-C", 25.69),
                        new Stock("21Vianet Group Inc. ADR", "VNET", 5.10),
                        new Stock("Agritek Holdings Inc.", "AGTK", 0.02),
                        new Stock("Akamai Technologies Inc.", "AKAM", 72.01),
                        new Stock("Baidu Inc. ADR", "BIDU", 251.73),
                        new Stock("Blucora Inc.", "BCOR", 25.75),
                        new Stock("Boingo Wireless Inc.", "WIFI", 22.96),
                        new Stock("Brainybrawn Inc.", "BRNW", 0.00),
                        new Stock("Carbonite Inc.", "CARB", 32.25),
                        new Stock("China Finance Online Co. Ltd. ADR", "JRJC", 1.93),
                        new Stock("ChinaCache International Holdings Ltd. ADR", "CCIH", 1.30),
                        new Stock("ChitrChatr Communications Inc.", "CHICF", 0.00),
                        new Stock("Cogent Communications Holdings Inc.", "CCOI", 48.20),
                        new Stock("Crexendo Inc.", "CXDO", 2.50),
                        new Stock("CrowdGather Inc.", "CRWG", 0.01),
                        new Stock("Eastern Asteria Inc.", "EATR", 0.00),
                        new Stock("ENDEXX Corp.", "EDXC", 0.04),
                        new Stock("Envestnet Inc.", "ENV", 57.20),
                        new Stock("Facebook Inc. Cl A", "FB", 176.61),
                        new Stock("First Liberty Power Corp.", "FLPC", 0.00),
                        new Stock("FlashZero Corp.", "FZRO", 0.00),
                        new Stock("Genesis Electronics Group Inc.", "GEGI", 0.00),
                        new Stock("GoDaddy Inc. Cl A", "GDDY", 65.78),
                        new Stock("IAC/InterActiveCorp.", "IAC", 132.42),
                        new Stock("Internet Initiative Japan Inc. ADR", "IIJI", 9.28),
                        new Stock("iPass Inc.", "IPAS", 0.28),
                        new Stock("j2 Global Inc.", "JCOM", 84.14),
                        new Stock("Legend Oil & Gas Ltd.", "LOGL", 0.00),
                        new Stock("Limelight Networks Inc.", "LLNW", 5.28),
                        new Stock("Momo Inc. ADR", "MOMO", 35.36),
                        new Stock("Netease Inc. ADR", "NTES", 251.57),
                        new Stock("NIC Inc.", "EGOV", 15.45),
                        new Stock("O2 Secure Wireless Inc.", "OTOW", 0.00),
                        new Stock("Opera Software ASA ADR", "OPESY", 5.47),
                        new Stock("Peer to Peer Network", "PTOP", 0.00),
                        new Stock("Sify Technologies Ltd. ADR", "SIFY", 1.97),
                        new Stock("Sina Corp.", "SINA", 94.13),
                        new Stock("SMC Entertainment Inc.", "SMCE", 0.01),
                        new Stock("Sohu.com Inc.", "SOHU", 33.96),
                        new Stock("Spectral Capital Corp.", "FCCN", 0.00),
                        new Stock("Sunset Capital Assets Inc.", "SNST", 0.10),
                        new Stock("Tencent Holdings Ltd.", "TCTZF", 49.55),
                        new Stock("Tencent Holdings Ltd. ADR", "TCEHY", 49.61),
                        new Stock("TMM Inc.", "TMMI", 0.03),
                        new Stock("Toron Inc.", "TRON", 0.01),
                        new Stock("Tucows Inc.", "TCX", 64.00),
                        new Stock("Twitter Inc.", "TWTR", 31.04),
                        new Stock("Web.com Group Inc.", "WEB", 17.45),
                        new Stock("Xunlei Ltd. ADR", "XNET", 13.43),
                        new Stock("Yahoo Japan Corp. ADR", "YAHOY", 7.07),
                        new Stock("Yandex N.V. Cl A", "YNDX", 33.58),
                        new Stock("Yangaroo Inc.", "YOOIF", 0.20),
                        new Stock("Yippy Inc.", "YIPI", 0.43),
                        new Stock("Alibaba Group Holding ADR",  "BABA", 188.89),
                        new Stock("Bank of America",  "BAC", 29.30),
                        new Stock("Pandora Media",  "P", 6.89),
                        new Stock("General Electric",  "GE", 14.10),
                        new Stock("Snap",  "SNAP", 10.79),
                        new Stock("Ford Motor",  "F", 11.36),
                        new Stock("Chesapeake Energy",  "CHK", 3.05),
                        new Stock("AT&T",  "T", 32.14),
                        new Stock("Southwestern Energy",  "SWN", 4.03),
                        new Stock("McDermott International",  "MDR", 6.66),
                        new Stock("Ambev ADR",  "ABEV", 6.33),
                        new Stock("Nokia ADR",  "NOK", 6.10),
                        new Stock("Sprint",  "S", 5.28),
                        new Stock("Twitter",  "TWTR", 31.04),
                        new Stock("Teva Pharmaceutical Industries ADR",  "TEVA", 17.83),
                        new Stock("Vale ADR",  "VALE", 14.08),
                        new Stock("AK Steel Holding",  "AKS", 4.53),
                        new Stock("Pfizer",  "PFE", 34.84),
                        new Stock("KKR",  "KKR", 23.00),
                        new Stock("Wells Fargo",  "WFC", 52.41),
                        new Stock("Marathon Oil",  "MRO", 19.72),
                        new Stock("Petroleo Brasileiro ADR",  "PBR", 13.69),
                        new Stock("Weatherford International",  "WFT", 2.97),
                        new Stock("Freeport-McMoRan",  "FCX", 15.42),
                        new Stock("Parsley Energy Cl A",  "PE", 31.92),
                        new Stock("First Data Cl A",  "FDC", 19.08),
                        new Stock("J.C. Penney",  "JCP", 2.89),
                        new Stock("Transocean",  "RIG", 12.08),
                        new Stock("Kinder Morgan",  "KMI", 16.11),
                        new Stock("Encana",  "ECA", 13.16),
                        new Stock("Fluor",  "FLR", 45.76),
                        new Stock("American International Group",  "AIG", 52.84),
                        new Stock("Citigroup",  "C", 67.94),
                        new Stock("Zayo Group Holdings",  "ZAYO", 32.97),
                        new Stock("JPMorgan Chase",  "JPM", 108.43),
                        new Stock("Newell Brands",  "NWL", 27.65),
                        new Stock("CVS Health",  "CVS", 63.10),
                        new Stock("United States Steel",  "X", 34.52),
                        new Stock("Itau Unibanco Holding ADR",  "ITUB", 13.44),
                        new Stock("VEREIT",  "VER", 6.94),
                        new Stock("WPX Energy",  "WPX", 17.78),
                        new Stock("Denbury Resources",  "DNR", 3.40),
                        new Stock("Morgan Stanley",  "MS", 51.40),
                        new Stock("Oracle",  "ORCL", 45.71),
                        new Stock("Verizon Communications",  "VZ", 48.19),
                        new Stock("Square Cl A",  "SQ", 49.10),
                        new Stock("Coca-Cola",  "KO", 42.36),
                        new Stock("Cleveland-Cliffs",  "CLF", 7.69),
                        new Stock("Babcock&Wilcox Enterprises",  "BW", 2.65),
                        new Stock("Oasis Petroleum",  "OAS", 11.22),
                        new Stock("Annaly Capital Management",  "NLY", 10.35),
                        new Stock("NRG Energy",  "NRG", 33.30),
                        new Stock("Walt Disney",  "DIS", 101.15),
                        new Stock("Exxon Mobil",  "XOM", 76.90),
                        new Stock("Taiwan Semiconductor Manufacturing ADR",  "TSM", 38.59),
                        new Stock("Yamana Gold",  "AUY", 2.93),
                        new Stock("Blue Apron Holdings Cl A",  "APRN", 2.44),
                        new Stock("Regions Financial",  "RF", 18.72),
                        new Stock("Vistra Energy",  "VST", 23.01),
                        new Stock("Sysco",  "SYY", 62.29),
                        new Stock("CBS Cl B",  "CBS", 53.17),
                        new Stock("Kinross Gold",  "KGC", 4.03),
                        new Stock("MGM Resorts International",  "MGM", 31.86),
                        new Stock("Hanesbrands",  "HBI", 16.81),
                        new Stock("CenterPoint Energy",  "CNP", 26.39),
                        new Stock("Nabors Industries",  "NBR", 7.54),
                        new Stock("ENSCO",  "ESV", 5.81),
                        new Stock("Procter&Gamble",  "PG", 72.43),
                        new Stock("CenturyLink",  "CTL", 18.49),
                        new Stock("Merck&Co",  "MRK", 57.75),
                        new Stock("MetLife",  "MET", 46.23),
                        new Stock("Cemex ADR",  "CX", 5.96),
                        new Stock("DowDuPont",  "DWDP", 64.47),
                        new Stock("Cardinal Health",  "CAH", 53.01),
                        new Stock("ICICI Bank ADR",  "IBN", 8.47),
                        new Stock("Host Hotels&Resorts",  "HST", 19.84),
                        new Stock("Juniper Networks",  "JNPR", 25.66),
                        new Stock("KeyCorp",  "KEY", 19.70),
                        new Stock("Walmart",  "WMT", 87.53),
                        new Stock("Shake Shack Cl A",  "SHAK", 55.95),
                        new Stock("Macy's",  "M", 31.24),
                        new Stock("California Resources",  "CRC", 31.58),
                        new Stock("Williams",  "WMB", 26.19),
                        new Stock("Boardwalk Pipeline Partners",  "BWP", 9.56),
                        new Stock("Altria Group",  "MO", 56.26),
                        new Stock("General Motors",  "GM", 36.71),
                        new Stock("HP",  "HPQ", 21.68),
                        new Stock("Vipshop Holdings ADR",  "VIPS", 15.75),
                        new Stock("Devon Energy",  "DVN", 37.87),
                        new Stock("Barrick Gold",  "ABX", 13.47),
                        new Stock("Halliburton",  "HAL", 52.19),
                        new Stock("Kroger",  "KR", 24.14),
                        new Stock("Callon Petroleum",  "CPE", 13.55),
                        new Stock("Newfield Exploration",  "NFX", 27.34),
                        new Stock("General Mills",  "GIS", 42.54),
                        new Stock("ConocoPhillips",  "COP", 66.86),
                        new Stock("Hewlett Packard Enterprise",  "HPE", 17.21),
                        new Stock("Bristol-Myers Squibb",  "BMY", 51.33),
                        new Stock("U.S. Bancorp",  "USB", 50.34),
                        new Stock("Johnson&Johnson",  "JNJ", 124.19)
                };
    }
    public Stock[] getStockList()
    {
        return allStocks;
    }

    public void sortByName()
    {
        System.out.println("Sorting By Name");
        StockSort.selectionSort(allStocks, allStocks.length, SortingCategory.STOCKNAME);
        showArray(allStocks);

    }

    public void sortByPrice()
    {
        System.out.println("Sorting By Price");
        StockSort.selectionSort(allStocks, allStocks.length, SortingCategory.STOCKPRICE);
        showArray(allStocks);
    }

    public void sortByTicker()
    {
        System.out.println("Sorting By Ticker");
        StockSort.selectionSort(allStocks, allStocks.length, SortingCategory.STOCKTICKER);
        showArray(allStocks);
    }

    private static <T> void showArray(T[]array)
    {
        for(int i = 0; i< array.length; i++)
            System.out.println(array[i]);
    }
}