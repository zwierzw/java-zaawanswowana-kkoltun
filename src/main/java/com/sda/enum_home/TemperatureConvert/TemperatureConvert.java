package com.sda.enum_home.TemperatureConvert;

public enum TemperatureConvert implements Converter{
    C_F('C', 'F', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn *9/5 + 32;
        }
    }),

    C_K('C','K', new Converter(){
        @Override
        public float convert(float tempIn) {
            return tempIn + 273.15f;
        }
    }),
    K_C(),
    F_C(),
    F_K(),
    K_F();

    private float tempIn;
    private float tempOut;
    private Converter converter;


    TemperatureConvert(float tempIn, float tempOut, Converter converter) {
        this.tempIn = tempIn;
        this.tempOut = tempOut;
        this.converter = converter;
    }


    @Override
    public float convert(float tempIn) {
        return 0;
    }
}
