import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AIPreProcessor {

    public static void main(String[] args) {
        // Simulamos una lista de nombres de datasets para un modelo de visión por computadora
        String[] datasets = {"Imágenes_Entrenamiento_01", "Imágenes_Entrenamiento_02", 
                             "Validación_Global", "Test_Final_RedNeuronal", 
                             "Aumentacion_Datos_A", "Aumentacion_Datos_B"};

        // 1. Creación del ExecutorService: 
        // Usamos un pool de 3 hilos para no saturar la CPU durante la normalización intensiva
        ExecutorService pipelineExecutor = Executors.newFixedThreadPool(3);

        System.out.println("--- Iniciando Pipeline de Preprocesamiento de IA ---");

        for (String dataset : datasets) {
            // Enviamos cada dataset como una tarea independiente
            pipelineExecutor.execute(() -> {
                String threadName = Thread.currentThread().getName();
                processDataset(dataset, threadName);
            });
        }

        // 2. Apagado ordenado (Graceful Shutdown)
        pipelineExecutor.shutdown();

        try {
            // Esperamos a que todas las tareas terminen antes de proceder al entrenamiento
            if (!pipelineExecutor.awaitTermination(60, TimeUnit.SECONDS)) {
                pipelineExecutor.shutdownNow();
            }
        } catch (InterruptedException e) {
            pipelineExecutor.shutdownNow();
            Thread.currentThread().interrupt();
        }

        System.out.println("--- Preprocesamiento completado. El modelo está listo para el entrenamiento. ---");
    }

    /**
     * Simulación de una tarea pesada de IA: Normalización de valores de píxeles (0-255 a 0-1).
     */
    private static void processDataset(String name, String worker) {
        try {
            System.out.println("[" + worker + "] Procesando y normalizando: " + name);
            // Simulamos carga de trabajo (I/O o procesamiento matemático)
            Thread.sleep((long) (Math.random() * 2000)); 
            System.out.println("[" + worker + "] Finalizado: " + name);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
