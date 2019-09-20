package com.boot;

import com.boot.template.pojo.DepartmentRecursionDto;
import com.boot.template.pojo.GroupTest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: shangshanshan
 * @date: 2018-9-3 10:39
 * @Description: TODO
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class LambdaTest {


    /**
     * @author: shangshanshan
     * @description: //当前时间转换为星期几  输出星期日
     * @date: 2018-10-8 14:07
     * @param: []
     * @return: void
     */
    @Test
    public void getWeek(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse("2018-09-09",formatter);

        String weekStr = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());

        System.out.println(weekStr);

        String time = new String("2019-3-12 16:37:00");
        String time1 = time.substring(0,time.length() - 3);
        System.out.println(time1);
    }

    @Test
    public void listSort(){
        List<String> list = new ArrayList<>();
        list.add("2018-07-23");
        list.add("2018-06-21");
        list.add("2018-08-16");
        list.add("2018-07-26");
        list.add("2018-07-29");
        list.forEach(e ->System.out.println(e + 1));

        list.sort(String::compareTo);

        System.out.println("-------------------------");

        list.forEach(f -> System.out.println(f));
    }
    
    /**
     * @author: shangshanshan
     * @description: //去重
     * @date: 2018-10-8 14:08
     * @param: []
     * @return: void
     */
    @Test
    public void distinctTest(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("4");
        list.add("4");
        list.add("3");
        list.add("2");
        list.forEach(e ->System.out.println(e + 1));

        list.stream().distinct();

        System.out.println("-------------------------");

        list.forEach(f -> System.out.println(f));
    }

    @Test
    public void sortTest(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(14);
        list.add(45);
        list.add(3);
        list.add(56);
        list.add(23);
        list.add(26);
        list.add(16);
        list.add(37);

        list.sort(Comparator.reverseOrder());

        System.out.println("-------------------------");

        list.forEach(f -> System.out.println(f));
    }



    public static void main(String[] args) {
        String message = "";
        Object object = new Object();

 //       message = ObjectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        System.out.println(message + "111111111111111111111111");

    }

    public void timeTest(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    }

    /**
     * @author: shangshanshan
     * @description: //动态分页 跳过skip()方法 前多少个 limit截取都少个
     * @date: 2018-10-8 14:11
     * @param: []
     * @return: void
     */
    @Test
    public void limitTest(){
       List<String> list = new ArrayList<>();
       list.add("1");
       list.add("2");
       list.add("3");
       list.add("4");
       list.add("5");
       list.add("6");
       list.add("7");
       list.add("8");
       list.add("9");
       list.add("10");
       list.add("11");
       list.add("12");
       list.add("13");
       list.add("14");
       list.add("15");
       list.add("16");
       list.add("17");
       list.add("18");
       list.add("19");
       list.add("20");

       List<String> lt = list.stream().skip(10).limit(5).collect(Collectors.toList());

       lt.forEach(e -> System.out.println(e));
    }

    @Test
    public void javaTimeTest(){
        //获取当前时间年月日格式
        LocalDate localDate = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()).toLocalDate();
        System.out.println("获取年月日格式:" + localDate);
    }

    @Test
    public void javaTime(){
        LocalDate date = LocalDate.now();
        LocalDateTime time = date.atTime(18,13,59);
        System.out.println("date:" + date);
        System.out.println("time:" + time);
    }

    /**
     * @author: shangshanshan
     * @description: //LocalDateTime 转换为Date 和时间戳
     * @date: 2018-10-8 14:20
     * @param: []
     * @return: void
     */
    @Test
    public void timeToTimestamp() throws ParseException {

        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault());
        int hour = dateTime.getHour();
        System.out.println(hour + "1111");
        Instant instant = dateTime.atZone(ZoneId.systemDefault()).toInstant();
        Date date = Date.from(instant);
        System.out.println(date + " : " + date.getTime());
        String st = "227841403437187072F30157EF-5C32-4E73-8234-EF2A75BD1B96";
        System.out.println(st.length());

    }

    @Test
    public void repaceStr(){
        String OAUTH_CODE_URL = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect";
        String button2Url = OAUTH_CODE_URL.replace("APPID","123456").replace("REDIRECT_URI","http://file.schoolcloud.ys100.com").replace("SCOPE","snsapi_base").replace("STATE","3");
        System.out.println(button2Url);
    }

    @Test
    public void catValue(){
        int value = 5709;
        //个位数值
        int a = value%10;
        //十分位数值
        int b = value/10%10;
        //百分位
        int c = value/100%10;
        //千分位
        int d = value/1000%10;

        System.out.println("个位：" + a + "--- 十位：" + b + " --- 百位：" + c + " --- 千位：" + d);

    }

    @Test
    public void times(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date = LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault()).toLocalDate();

        int week = date.getDayOfWeek().getValue();
        DayOfWeek[] week1 = DayOfWeek.values();

        int week2 = DayOfWeek.MONDAY.getValue();
        LocalDate startTime = date.minusDays(date.getDayOfWeek().getValue() - DayOfWeek.MONDAY.getValue()).minusWeeks(1);
        LocalDate date1 = date.plusDays(DayOfWeek.SUNDAY.getValue() - date.getDayOfWeek().getValue()).minusWeeks(1);

        LocalDate start= date.withDayOfMonth(1);

        LocalDate endTime = date.with(TemporalAdjusters.lastDayOfMonth());

        LocalDate startTime1 = date.minusMonths(1).withDayOfMonth(1);
        LocalDate endTime1 = date.minusMonths(1).with(TemporalAdjusters.lastDayOfMonth());


        LocalDate time3 = LocalDate.of(2018,12,17);
        boolean flag = time3.isAfter(date);
        System.out.println(flag);
        System.out.println(endTime1);
        System.out.println(startTime1);
        System.out.println(endTime);
        System.out.println(formatter.format(start));
        System.out.println(formatter.format(startTime));
        System.out.println(formatter.format(date1));
        System.out.println(week1.length);
        System.out.println(week2);
        System.out.println(week);
    }

    @Test
    public void delBlack(){
        String st = " asd  qwe      we";
        String s = st.replaceAll(" ","");
        String s1 = st.replace(" ","");
        System.out.println(s);
        System.out.println(s1 + "+111");
    }

    @Test
    public void timeChange(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = new String("2019-3-12 14:50:00");
        try {
            Date date = format.parse(time);
            System.out.println("时间转换：" + date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("w");
        LocalDate time1 = LocalDateTime.of(2019,1,7,0,0,0).toLocalDate();
        WeekFields weekFields = WeekFields.of(DayOfWeek.MONDAY,4);
        System.out.println(time1.get(weekFields.weekOfWeekBasedYear()));

    }

    @Test
    public void timeMins(){
        LocalDate localDate = LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault()).toLocalDate();
        LocalDate localDate1 = localDate.minusDays(30);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(formatter.format(localDate));
        System.out.println(formatter.format(localDate1));

        String stage = new String("203040506");
        List<String> list = Arrays.asList(stage.split("0"));

        list.forEach(e -> System.out.println(e));
    }

    @Test
    public void groupCount(){
        List<GroupTest> list = new ArrayList<>();

        list.add(new GroupTest(4,"123"));
        list.add(new GroupTest(4,"123"));
        list.add(new GroupTest(4,"123"));
        list.add(new GroupTest(4,"123"));
        list.add(new GroupTest(4,"123"));
        list.add(new GroupTest(4,"123"));
        list.add(new GroupTest(4,"123"));
        list.add(new GroupTest(4,"123"));
        list.add(new GroupTest(4,"123"));
        list.add(new GroupTest(2,"8"));
        list.add(new GroupTest(2,"78"));
        list.add(new GroupTest(2,"45"));
        list.add(new GroupTest(2,"78"));
        list.add(new GroupTest(2,"4"));
        list.add(new GroupTest(2,"45"));
        list.add(new GroupTest(2,"145"));
        list.add(new GroupTest(2,"644"));
        list.add(new GroupTest(1,"123"));
        list.add(new GroupTest(1,"456"));
        list.add(new GroupTest(1,"789"));

        list.add(new GroupTest(3,"123"));
        list.add(new GroupTest(3,"123"));
        list.add(new GroupTest(3,"123"));
        list.add(new GroupTest(3,"123"));
        list.add(new GroupTest(3,"123"));


        Map<Integer,Long> map = list.stream().collect(Collectors.groupingBy(GroupTest::getStage,Collectors.counting()));

        map.forEach((k,v) ->{
            System.out.println(k + "+++" + v);
        });
    }

    @Test
    public void test(){
        DepartmentRecursionDto dto = new DepartmentRecursionDto();
        dto.setParentFkCode("123");
        dto.setParentName("1");
        DepartmentRecursionDto oneDto = new DepartmentRecursionDto();
        oneDto.setParentName("2");
        dto.setSonInfor(oneDto);

        DepartmentRecursionDto twoDto = new DepartmentRecursionDto();
        twoDto.setParentName("3");
        oneDto.setSonInfor(twoDto);
        DepartmentRecursionDto threeDto = new DepartmentRecursionDto();
        threeDto.setParentName("4");
        twoDto.setSonInfor(threeDto);
        DepartmentRecursionDto fourDto = new DepartmentRecursionDto();
        fourDto.setParentName("5");
        threeDto.setSonInfor(fourDto);

        System.out.println(dto);


        Map<Integer,String> map = new HashMap<>();
        map.put(1,"abc");
        map.put(2,"账号");
        map.put(3,"345");

        boolean flag = !map.containsValue("账号");
        System.out.println(flag);

        boolean sta = true;

        if (sta && flag){
            System.out.println("执行");
        } else{
            System.out.println("不执行");
        }
    }

    @Test
    public void test1(){
        Integer selectYear = Integer.valueOf("2018-2019".split("-")[0]);

        String[] st = "2018-2019".split("-");

        Arrays.stream(st).forEach(e -> System.out.println(e));

        System.out.println(selectYear);

        Integer[] sts =  {1,2,3,4};
        List<Integer> lt = Arrays.asList(sts);

        lt.forEach(e -> System.out.println(e));
        float ft = 655/23334;
        if (ft<0.1){
            ft = (float) 0.1;
        }

        System.out.println(ft);
    }

    @Test
    public void days(){

        LocalDate date = LocalDate.of(2019,7,14);
        LocalDate date1 = LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault()).toLocalDate();

        int day = Period.between(date,date1).getDays();
        System.out.println(day);

        long day1 = ChronoUnit.DAYS.between(date,date1);
        System.out.println(day1);


        Instant instant = Instant.ofEpochSecond(1563724800);
        LocalDate date2 =  LocalDateTime.ofInstant(instant,ZoneId.systemDefault()).toLocalDate();
        System.out.println(date2);

        String now = String.valueOf(date.atStartOfDay(ZoneOffset.ofHours(8)).toInstant().getEpochSecond());
        System.out.println(now);
    }
}
