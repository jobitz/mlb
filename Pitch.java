public class Pitch {
    private final int pitchNum;
    private final int pitchSpeed;
    private final String pitchType;

    public Pitch(int pitchNum, int pitchSpeed, String pitchType){
        this.pitchNum = pitchNum;
        this.pitchSpeed = pitchSpeed;
        this.pitchType = pitchType;
    }

    public int getPitchNum(){
        return pitchNum;
    }

    public int getPitchSpeed(){
        return pitchSpeed;
    }

    public String getPitchType(){
        return pitchType;
    }
}
