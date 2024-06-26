import { Component } from '@angular/core';
import { IonHeader, IonToolbar, IonTitle, IonContent, IonFabButton, IonIcon, IonFab } from '@ionic/angular/standalone';
import { ExploreContainerComponent } from '../explore-container/explore-container.component';
import { addIcons } from 'ionicons';
import { camera } from 'ionicons/icons';

@Component({
  selector: 'app-tab2',
  templateUrl: 'tab2.page.html',
  styleUrls: ['tab2.page.scss'],
  standalone: true,
  imports: [IonHeader, IonToolbar, IonTitle, IonContent, ExploreContainerComponent, IonFabButton, IonIcon, IonFab]
})
export class Tab2Page {

  constructor() {
    addIcons({ camera });
  }

}
