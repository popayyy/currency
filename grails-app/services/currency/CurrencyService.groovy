package currency

import java.text.DateFormat
import java.text.SimpleDateFormat

class CurrencyService {

    public static DateFormat df = new SimpleDateFormat("dd/MM/yyyy")
    public static String USDvalNmRq = "R01235"
    public static String EURvalNmRq = "R01239"

    def getCurrencyFromRange(Date from, Date to, String valNmRq) {

//        def url = "http://www.cbr.ru/scripts/XML_dynamic.asp?date_req1=${df.format(from)}&date_req2=${df.format(to)}&VAL_NM_RQ=R01239"
//        println "make url request to: ${url}"
//        def EURcontent = new URL(url).getText()

        getCurrencyFromDate(from, valNmRq)

        return []
    }

    def getCurrencyFromDate(Date date, String valNmRq) {

        def url = "http://www.cbr.ru/scripts/XML_dynamic.asp?date_req1=${df.format(date)}&date_req2=${df.format(date)}&VAL_NM_RQ=${valNmRq}"
        println "make url request to: ${url}"
        def content = new URL(url).getText()

        return null
    }
}
