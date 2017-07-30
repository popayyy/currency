package currency

class CurrencyController {

    def currencyService

    def index() {

        Calendar curCal = Calendar.getInstance()
        Date dateTo = curCal.getTime()

        Calendar last30Days = Calendar.getInstance()
        last30Days.add(Calendar.DAY_OF_MONTH, -30)
        Date dateFrom = last30Days.getTime()

        println "getting currency form ${dateFrom} to ${dateTo}"

        def currencyUSDList = currencyService.getCurrencyFromRange(dateFrom, dateTo, currencyService.USDvalNmRq)

        def currencyMap = []

        render view: "index",
                model: [dateFrom   : dateTo,
                        dateTo     : dateTo,
                        currencyMap: currencyMap]
    }
}
