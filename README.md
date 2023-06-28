# Grip op Geluid Phone
 ## Introductie
 Deze GIT bevat de testversie voor de smartphone applicatie van Grip op Geluid. De smartphone applicatie is een startpunt voor een toekomstige uitbreiding, waarbij data kan worden toegevoegd om een grafiek te laten zien en advies te kunnen geven aan de vakdocent bewegingsonderwijs. Dit was mijn eerste project met zowel Java als Android Studio.
## Opzetten van de ontwikkelomgeving
Om deze applicatie te openen dient Android Studio geïnstalleerd te worden. Dit kan op de volgende website: https://developer.android.com/studio?gclid=Cj0KCQjwtO-kBhDIARIsAL6LorewDyB4alqWk8tiFW5eijNe3Hw5G85o4d-qg05YqjkTc-xMuFybuiAaAudcEALw_wcB&gclsrc=aw.ds
De applicatie vereist tevens een eigen telefoon of een emulator.
- Voor het installeren van een emulator, ga naar https://developer.android.com/studio/run/managing-avds en selecteer bij het installeren een Android emulator met versie 11 van het besturingssysteem.
- Voor het gebruiken van een echte telefoon, ga naar https://developer.android.com/studio/run/device. Verifieer vooraf of de telefoon die je gaat gebruiken Android versie 11 of hoger heeft.
## Bekende problemen
De applicatie heeft op dit moment enkele bekende problemen:
- De grafiek werkt niet meer als er van fragment wordt gewisseld. Dit kan worden opgelost door de applicatie te herstarten.
- Bij het wisselen tussen de instellingen en de synchronisatie blijft het instellingen menu in beeld staan.
- requireFragmentManager is depricated. Dit betekend dat dit stuk code nog wel werkt, maar dat dit onderdeel niet meer wordt ondersteund. Er moet naar een alternatief worden gezocht als we de applicatie willen gaan uitbreiden. Voor de huidige demo is dit niet van belang.
