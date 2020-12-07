package HomeWork7;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader{

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {

        String name = String.valueOf(currencyName);
        String currencyRate = "\"Cur_OfficialRate\":";
        String sub = content.substring(content.indexOf(currencyRate) + currencyRate.length(), content.length() - 3);
        int i = 0;
        double value = 0;

        while ((i = content.indexOf(name, i)) != -1){
            try{
                value = Double.parseDouble(sub);
            }catch (NumberFormatException e){
                e.printStackTrace();
            }
            i++;
        }

        return value;
    }
}
