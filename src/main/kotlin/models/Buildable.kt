package models

interface Buildable {

    var buildTimeDays: Int

    fun build();
}