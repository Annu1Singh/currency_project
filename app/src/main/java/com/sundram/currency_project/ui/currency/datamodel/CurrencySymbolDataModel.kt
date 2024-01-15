package com.sundram.currency_project.ui.currency.datamodel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class CurrencySymbolDataModel(
    @SerializedName("success")
    var success: Boolean,
    @SerializedName("symbols")
    val symbols: Symbols
)

data class Symbols(

    @SerializedName("AED")
    @Expose
    val aed: String,

    @SerializedName("AFN")
    @Expose
    val afn: String,

    @SerializedName("ALL")
    @Expose
    val all: String,

    @SerializedName("AMD")
    @Expose
    val amd: String,

    @SerializedName("ANG")
    @Expose
    val ang: String,

    @SerializedName("AOA")
    @Expose
    val aoa: String,

    @SerializedName("ARS")
    @Expose
    val ars: String,

    @SerializedName("AUD")
    @Expose
    val aud: String,

    @SerializedName("AWG")
    @Expose
    val awg: String,

    @SerializedName("AZN")
    @Expose
    val azn: String,

    @SerializedName("BAM")
    @Expose
    val bam: String,

    @SerializedName("BBD")
    @Expose
    val bbd: String,

    @SerializedName("BDT")
    @Expose
    val bdt: String,

    @SerializedName("BGN")
    @Expose
    val bgn: String,

    @SerializedName("BHD")
    @Expose
    val bhd: String,

    @SerializedName("BIF")
    @Expose
    val bif: String,

    @SerializedName("BMD")
    @Expose
    val bmd: String,

    @SerializedName("BND")
    @Expose
    val bnd: String,

    @SerializedName("BOB")
    @Expose
    val bob: String,

    @SerializedName("BRL")
    @Expose
    val brl: String,

    @SerializedName("BSD")
    @Expose
    val bsd: String,

    @SerializedName("BTC")
    @Expose
    val btc: String,

    @SerializedName("BTN")
    @Expose
    val btn: String,

    @SerializedName("BWP")
    @Expose
    val bwp: String,

    @SerializedName("BYN")
    @Expose
    val byn: String,

    @SerializedName("BYR")
    @Expose
    val byr: String,

    @SerializedName("BZD")
    @Expose
    val bzd: String,

    @SerializedName("CAD")
    @Expose
    val cad: String,

    @SerializedName("CDF")
    @Expose
    val cdf: String,

    @SerializedName("CHF")
    @Expose
    val chf: String,

    @SerializedName("CLF")
    @Expose
    val clf: String,

    @SerializedName("CLP")
    @Expose
    val clp: String,

    @SerializedName("CNY")
    @Expose
    val cny: String,

    @SerializedName("COP")
    @Expose
    val cop: String,

    @SerializedName("CRC")
    @Expose
    val crc: String,

    @SerializedName("CUC")
    @Expose
    val cuc: String,

    @SerializedName("CUP")
    @Expose
    val cup: String,

    @SerializedName("CVE")
    @Expose
    val cve: String,

    @SerializedName("CZK")
    @Expose
    val czk: String,

    @SerializedName("DJF")
    @Expose
    val djf: String,

    @SerializedName("DKK")
    @Expose
    val dkk: String,

    @SerializedName("DOP")
    @Expose
    val dop: String,

    @SerializedName("DZD")
    @Expose
    val dzd: String,

    @SerializedName("EGP")
    @Expose
    val egp: String,

    @SerializedName("ERN")
    @Expose
    val ern: String,

    @SerializedName("ETB")
    @Expose
    val etb: String,

    @SerializedName("EUR")
    @Expose
    val eur: String,

    @SerializedName("FJD")
    @Expose
    val fjd: String,

    @SerializedName("FKP")
    @Expose
    val fkp: String,

    @SerializedName("GBP")
    @Expose
    val gbp: String,

    @SerializedName("GEL")
    @Expose
    val gel: String,

    @SerializedName("GGP")
    @Expose
    val ggp: String,

    @SerializedName("GHS")
    @Expose
    val ghs: String,

    @SerializedName("GIP")
    @Expose
    val gip: String,

    @SerializedName("GMD")
    @Expose
    val gmd: String,

    @SerializedName("GNF")
    @Expose
    val gnf: String,

    @SerializedName("GTQ")
    @Expose
    val gtq: String,

    @SerializedName("GYD")
    @Expose
    val gyd: String,

    @SerializedName("HKD")
    @Expose
    val hkd: String,

    @SerializedName("HNL")
    @Expose
    val hnl: String,

    @SerializedName("HRK")
    @Expose
    val hrk: String,

    @SerializedName("HTG")
    @Expose
    val htg: String,

    @SerializedName("HUF")
    @Expose
    val huf: String,

    @SerializedName("IDR")
    @Expose
    val idr: String,

    @SerializedName("ILS")
    @Expose
    val ils: String,

    @SerializedName("IMP")
    @Expose
    val imp: String,

    @SerializedName("INR")
    @Expose
    val inr: String,

    @SerializedName("IQD")
    @Expose
    val iqd: String,

    @SerializedName("IRR")
    @Expose
    val irr: String,

    @SerializedName("ISK")
    @Expose
    val isk: String,

    @SerializedName("JEP")
    @Expose
    val jep: String,

    @SerializedName("JMD")
    @Expose
    val jmd: String,

    @SerializedName("JOD")
    @Expose
    val jod: String,

    @SerializedName("JPY")
    @Expose
    val jpy: String,

    @SerializedName("KES")
    @Expose
    val kes: String,

    @SerializedName("KGS")
    @Expose
    val kgs: String,

    @SerializedName("KHR")
    @Expose
    val khr: String,

    @SerializedName("KMF")
    @Expose
    val kmf: String,

    @SerializedName("KPW")
    @Expose
    val kpw: String,

    @SerializedName("KRW")
    @Expose
    val krw: String,

    @SerializedName("KWD")
    @Expose
    val kwd: String,

    @SerializedName("KYD")
    @Expose
    val kyd: String,

    @SerializedName("KZT")
    @Expose
    val kzt: String,

    @SerializedName("LAK")
    @Expose
    val lak: String,

    @SerializedName("LBP")
    @Expose
    val lbp: String,

    @SerializedName("LKR")
    @Expose
    val lkr: String,

    @SerializedName("LRD")
    @Expose
    val lrd: String,

    @SerializedName("LSL")
    @Expose
    val lsl: String,

    @SerializedName("LTL")
    @Expose
    val ltl: String,

    @SerializedName("LVL")
    @Expose
    val lvl: String,

    @SerializedName("LYD")
    @Expose
    val lyd: String,

    @SerializedName("MAD")
    @Expose
    val mad: String,

    @SerializedName("MDL")
    @Expose
    val mdl: String,

    @SerializedName("MGA")
    @Expose
    val mga: String,

    @SerializedName("MKD")
    @Expose
    val mkd: String,

    @SerializedName("MMK")
    @Expose
    val mmk: String,

    @SerializedName("MNT")
    @Expose
    val mnt: String,

    @SerializedName("MOP")
    @Expose
    val mop: String,

    @SerializedName("MRU")
    @Expose
    val mru: String,

    @SerializedName("MUR")
    @Expose
    val mur: String,

    @SerializedName("MVR")
    @Expose
    val mvr: String,

    @SerializedName("MWK")
    @Expose
    val mwk: String,

    @SerializedName("MXN")
    @Expose
    val mxn: String,

    @SerializedName("MYR")
    @Expose
    val myr: String,

    @SerializedName("MZN")
    @Expose
    val mzn: String,

    @SerializedName("NAD")
    @Expose
    val nad: String,

    @SerializedName("NGN")
    @Expose
    val ngn: String,

    @SerializedName("NIO")
    @Expose
    val nio: String,

    @SerializedName("NOK")
    @Expose
    val nok: String,

    @SerializedName("NPR")
    @Expose
    val npr: String,

    @SerializedName("NZD")
    @Expose
    val nzd: String,

    @SerializedName("OMR")
    @Expose
    val omr: String,

    @SerializedName("PAB")
    @Expose
    val pab: String,

    @SerializedName("PEN")
    @Expose
    val pen: String,

    @SerializedName("PGK")
    @Expose
    val pgk: String,

    @SerializedName("PHP")
    @Expose
    val php: String,

    @SerializedName("PKR")
    @Expose
    val pkr: String,

    @SerializedName("PLN")
    @Expose
    val pln: String,

    @SerializedName("PYG")
    @Expose
    val pyg: String,

    @SerializedName("QAR")
    @Expose
    val qar: String,

    @SerializedName("RON")
    @Expose
    val ron: String,

    @SerializedName("RSD")
    @Expose
    val rsd: String,

    @SerializedName("RUB")
    @Expose
    val rub: String,

    @SerializedName("RWF")
    @Expose
    val rwf: String,

    @SerializedName("SAR")
    @Expose
    val sar: String,

    @SerializedName("SBD")
    @Expose
    val sbd: String,

    @SerializedName("SCR")
    @Expose
    val scr: String,

    @SerializedName("SDG")
    @Expose
    val sdg: String,

    @SerializedName("SEK")
    @Expose
    val sek: String,

    @SerializedName("SGD")
    @Expose
    val sgd: String,

    @SerializedName("SHP")
    @Expose
    val shp: String,

    @SerializedName("SLE")
    @Expose
    val sle: String,

    @SerializedName("SLL")
    @Expose
    val sll: String,

    @SerializedName("SOS")
    @Expose
    val sos: String,

    @SerializedName("SRD")
    @Expose
    val srd: String,

    @SerializedName("STD")
    @Expose
    val std: String,

    @SerializedName("SVC")
    @Expose
    val svc: String,

    @SerializedName("SYP")
    @Expose
    val syp: String,

    @SerializedName("SZL")
    @Expose
    val szl: String,

    @SerializedName("THB")
    @Expose
    val thb: String,

    @SerializedName("TJS")
    @Expose
    val tjs: String,

    @SerializedName("TMT")
    @Expose
    val tmt: String,

    @SerializedName("TND")
    @Expose
    val tnd: String,

    @SerializedName("TOP")
    @Expose
    val top: String,

    @SerializedName("TRY")
    @Expose
    val _try: String,

    @SerializedName("TTD")
    @Expose
    val ttd: String,

    @SerializedName("TWD")
    @Expose
    val twd: String,

    @SerializedName("TZS")
    @Expose
    val tzs: String,

    @SerializedName("UAH")
    @Expose
    val uah: String,

    @SerializedName("UGX")
    @Expose
    val ugx: String,

    @SerializedName("USD")
    @Expose
    val usd: String,

    @SerializedName("UYU")
    @Expose
    val uyu: String,

    @SerializedName("UZS")
    @Expose
    val uzs: String,

    @SerializedName("VEF")
    @Expose
    val vef: String,

    @SerializedName("VES")
    @Expose
    val ves: String,

    @SerializedName("VND")
    @Expose
    val vnd: String,

    @SerializedName("VUV")
    @Expose
    val vuv: String,

    @SerializedName("WST")
    @Expose
    val wst: String,

    @SerializedName("XAF")
    @Expose
    val xaf: String,

    @SerializedName("XAG")
    @Expose
    val xag: String,

    @SerializedName("XAU")
    @Expose
    val xau: String,

    @SerializedName("XCD")
    @Expose
    val xcd: String,

    @SerializedName("XDR")
    @Expose
    val xdr: String,

    @SerializedName("XOF")
    @Expose
    val xof: String,

    @SerializedName("XPF")
    @Expose
    val xpf: String,

    @SerializedName("YER")
    @Expose
    val yer: String,

    @SerializedName("ZAR")
    @Expose
    val zar: String,

    @SerializedName("ZMK")
    @Expose
    val zmk: String,

    @SerializedName("ZMW")
    @Expose
    val zmw: String,

    @SerializedName("ZWL")
    @Expose
    val zwl: String
)