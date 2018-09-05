package dimens.constants;


public enum DimenTypes {

    //适配Android 3.2以上   大部分手机的sw值集中在  300-460之间
    DP_sw__240(240),    // hdpi
    DP_sw__260(260),    // 小辣椒
    DP_sw__320(320),    // xhdpi
    DP_sw__360(360),
    DP_sw__380(380),
    DP_sw__400(400),
    DP_sw__420(420),    // pixel 2 & 5x 1080  5'
    DP_sw__460(460),
    DP_sw__480(480),    // xxhdpi
    DP_sw__560(560),    // pixel 2xl 1440 5.5'
    DP_sw__640(640);    // xxxhdpi

    // 想生成多少自己以此类推


    /**
     * 屏幕最小宽度
     */
    private int swWidthDp;


    DimenTypes(int swWidthDp) {
        this.swWidthDp = swWidthDp;
    }

    public int getSwWidthDp() {
        return swWidthDp;
    }

    public void setSwWidthDp(int swWidthDp) {
        this.swWidthDp = swWidthDp;
    }

}
