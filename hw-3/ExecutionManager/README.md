# ExecutionManager

Задача: реализовать интерфейс ExecutionManager.
 
Метод execute принимает массив тасков, это задания которые ExecutionManager должен выполнять параллельно (в вашей реализации пусть будет в своем пуле потоков). 
После завершения всех тасков должен выполниться callback (ровно 1 раз). 
 
Метод execute – это неблокирующий метод, который сразу возвращает объект Context. 

Context - это интерфейс следующего вида:
 
public interface Context {
    int getCompletedTaskCount();

    int getFailedTaskCount();

    int getInterruptedTaskCount();

    void interrupt();

    boolean isFinished();
}
 
Метод getCompletedTaskCount() возвращает количество тасков, которые на текущий момент успешно выполнились.

Метод getFailedTaskCount() возвращает количество тасков, при выполнении которых произошел Exception.

Метод interrupt() отменяет выполнения тасков, которые еще не начали выполняться.

Метод getInterruptedTaskCount() возвращает количество тасков, которые не были выполены из-за отмены (вызовом предыдущего метода).

Метод isFinished() вернет true, если все таски были выполнены или отменены, false в противном случае.  



Реализация:

ExecutionManager.java : interface

ExecutionManagerImpl.java : 1-ая реализация

ExecutionManagerImplThreadPool.java : 2-ая реализация

Context.java : interface

TestClass.java : для тестирования
