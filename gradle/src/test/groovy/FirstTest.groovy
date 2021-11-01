import org.junit.jupiter.api.Test

class FirstTest {

    @Test
    void testOne(){
        sleep(10000)
        assert 1 + 1 == 2
    }

    @Test
    void testTwo(){
        sleep(10000)
        assert 2 + 2 == 4
    }

    @Test
    void testThree(){
        sleep(10000)
        assert 3 + 3 == 6
    }

    @Test
    void testFour(){
        sleep(10000)
        assert 4 + 4 == 8
    }

    @Test
    void testFive(){
        sleep(10000)
        assert 5 + 5 == 10
    }
}
