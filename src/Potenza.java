public class Potenza extends OperazioneUnaria<Double> {
    public final int esponente;

    public Potenza(int esponente) {
        this.esponente = esponente;
    }

    @Override
    public Double applica(Double elem) {
        return Math.pow(elem, esponente);
    }

    @Override
    public OperazioneUnaria<Double> combina(OperazioneUnaria<Double> operazione) throws IllegalArgumentException {
        if (operazione instanceof Potenza) {
            return new Potenza(esponente + ((Potenza) operazione).esponente);
        } else {
            throw new IllegalArgumentException("L'operazione unaria non è una potenza.");
        }
    }
}
