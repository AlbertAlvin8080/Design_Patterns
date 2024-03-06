export interface Observer {
    propertyChange(source: Object): void;
}