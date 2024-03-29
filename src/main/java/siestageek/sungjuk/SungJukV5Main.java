package siestageek.sungjuk;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SungJukV5Main {
    private static SungJukV1cService sjsrv;
    // 성적 처리프로그램 v5
    // 배열과 클래스, 인터페이스, 예외처리, 컬렉션, 파일처리를 이용해서
    // 성적을 입력하면 총점,평균,학점을 계산함
    // SungJukV5Main, SungJukVO, SungJukV1cService, SungJukV4ServiceImpl
    // SungJukV5DAO, SungJukV5DAOImpl, sungjukv4.dat
    // 1. 성적데이터 입력
    // 2. 성적데이터 조회     (이름,국어,영어,수학)
    // 3. 성적데이터 상세조회  (모두 다 출력)
    // 4. 성적데이터 수정
    // 5. 성적데이터 삭제
    // 0. 프로그램 종료

    /*public static void main(String[] args) {
        SungJukV1cService sjsrv = new SungJukV5ServiceImpl();

        while (true) {
            int menu = sjsrv.displayMenu();

            sjsrv.processMenu(menu);
        }
    }*/
    public static void main(String[] args) {
        ApplicationContext ctx =
                new FileSystemXmlApplicationContext(
                        "src/sungjuk.xml");

        SungJukV1cService sjsrv =
                (SungJukV5ServiceImpl) ctx.getBean("sjsrv");

        while (true) {
            int menu = sjsrv.displayMenu();

            sjsrv.processMenu(menu);
        }
    }

}