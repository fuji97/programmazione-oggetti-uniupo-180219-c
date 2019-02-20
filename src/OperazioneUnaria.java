public abstract class OperazioneUnaria<T> {
    public abstract T applica(T elem);

    public abstract OperazioneUnaria<T> combina(OperazioneUnaria<T> operazione) throws IllegalArgumentException;

    public static <T> T ripeti(T elem, OperazioneUnaria<T>[] operazioni) {
        for (OperazioneUnaria<T> operazione : operazioni) {
            elem = operazione.applica(elem);
        }

        return elem;
    }
}
