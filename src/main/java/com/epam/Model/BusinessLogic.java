package com.epam.Model;

public class BusinessLogic implements IModel {

    private Schema schema;

    public BusinessLogic(){
        schema = new Schema();
    }
    @Override
    public String startSpeech() {
        return schema.startSpeech();
    }

    @Override
    public String continiueSpeech() {
        return schema.continiueSpeech();
    }

    @Override
    public String convince() {
        return schema.convince();
    }

    @Override
    public String callLoathing() {
        return schema.callLoathing();
    }

    @Override
    public String endSpeech() {
        return schema.endSpeech();
    }
}
